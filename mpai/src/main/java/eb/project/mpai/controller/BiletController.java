package eb.project.mpai.controller;

import eb.project.mpai.domain.*;
import eb.project.mpai.domain.bilete.*;
import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.enums.TipBilet;
import eb.project.mpai.domain.interfaces.Eveniment;
import eb.project.mpai.dto.Bilet;
import eb.project.mpai.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BiletController {


    @Autowired
    private BiletNormalCinemaService biletNormalCinemaService;
    @Autowired
    private BiletNormalConcertService biletNormalConcertService;
    @Autowired
    private BiletNormalTeatruService biletNormalTeatruService;
    @Autowired
    private BiletVIPCinemaService biletVIPCinemaService;
    @Autowired
    private BiletVIPConcertService biletVIPConcertService;
    @Autowired
    private BiletVIPTeatruService biletVIPTeatruService;

    @Autowired
    private RezervareService rezervareService;

    @Autowired
    private UtilizatorService utilizatorService;

    private AbstractFactory abstractFactory;
    private Eveniment eveniment;
    private Tip tipEveniment;
    private TipBilet tipBilet;
    Rezervare rezervare = new Rezervare();

    @GetMapping("/events/ticket")
    public String getTypeTicket(Model model) {
        Bilet ticket = new Bilet();
        model.addAttribute("ticket", ticket);
        return "events/ticket";
    }

    @PostMapping("/events/list")
    public String getAllTickets(@ModelAttribute Bilet bilet,Model model) {

        abstractFactory = TipBiletFactory.rezerva(TipBilet.valueOf(bilet.getTipBilet()));
        eveniment = abstractFactory.getItem(Tip.valueOf(bilet.getTipEveniment()));
        tipEveniment = Tip.valueOf(bilet.getTipEveniment());
        tipBilet=TipBilet.valueOf(bilet.getTipBilet());

        if(bilet.getTipBilet().equals("NORMAL")){
            switch (bilet.getTipEveniment()){
                case "Cinema":
                    model.addAttribute("events", biletNormalCinemaService.findAll());
                    break;
                case "Teatru":
                    model.addAttribute("events", biletNormalTeatruService.findAll());
                    break;
                case "Concert":
                    model.addAttribute("events", biletNormalConcertService.findAll());
                    break;
            }
        }else{
            switch (bilet.getTipEveniment()){
                case "Cinema":
                    model.addAttribute("events", biletVIPCinemaService.findAll());
                    break;
                case "Teatru":
                    model.addAttribute("events", biletVIPTeatruService.findAll());
                    break;
                case "Concert":
                    model.addAttribute("events", biletVIPConcertService.findAll());
                    break;
            }
        }
        return "events/list";
    }

    @GetMapping("/events/view/{id}")
    public String addTicket(@PathVariable(value = "id") Long id, Model model) {
        if(tipBilet.equals(TipBilet.NORMAL)){
            switch (tipEveniment){
                case Cinema:
                    BiletNormalCinema bnCinema= biletNormalCinemaService.findById(id).get();
                    rezervare.setBnCinema(bnCinema);
                    model.addAttribute("event", bnCinema);
                    break;
                case Concert:
                    BiletNormalConcert bnConcert = biletNormalConcertService.findById(id).get();
                    rezervare.setBnConcert(bnConcert);
                    model.addAttribute("event", bnConcert);
                    break;
                case Teatru:
                    BiletNormalTeatru bnTeatru = biletNormalTeatruService.findById(id).get();
                    rezervare.setBnTeatru(bnTeatru);
                    model.addAttribute("event", bnTeatru);
                    break;
            }
        }else{
            switch (tipEveniment){
                case Cinema:
                    BiletVIPCinema vipCinema= biletVIPCinemaService.findById(id).get();
                    rezervare.setVipCinema(vipCinema);
                    model.addAttribute("event", vipCinema);
                    break;
                case Concert:
                    BiletVIPConcert vipConcert = biletVIPConcertService.findById(id).get();
                    rezervare.setVipConcert(vipConcert);
                    model.addAttribute("event", vipConcert);
                    break;
                case Teatru:
                    BiletVIPTeatru vipTeatru = biletVIPTeatruService.findById(id).get();
                    rezervare.setVipTeatru(vipTeatru);
                    model.addAttribute("event", vipTeatru);
                    break;
            }
        }
        Utilizator utilizator = utilizatorService.findById(Long.valueOf(1)).get();
        rezervare.setUtilizator(utilizator);

        Bilet inregistrareDateFinaleRezervare = new Bilet();
        model.addAttribute("finalData", inregistrareDateFinaleRezervare);
        return "events/view";
    }

    @PostMapping("/newreservation")
    public String addEvent(@ModelAttribute Bilet b, Model model) {
        rezervare.setLoc(Integer.parseInt(b.getLoc()));
        rezervareService.addRezervare(rezervare);
        eveniment.render();
        Utilizator utilizator = utilizatorService.findById(Long.valueOf(1)).get();

        List<Rezervare> rezervari = rezervareService.findAll();
        List<Bilet> rezervarileMele = new ArrayList<>();
        for (Rezervare r:rezervari) {

            Bilet ticket = new Bilet();

            if(r.getUtilizator().getId()!=null){

                ticket.setLoc(String.valueOf(r.getLoc()));

             if(r.getBnCinema()!=null){
                ticket.setLocatie(r.getBnCinema().getLocatie());
                ticket.setNumeEveniment(r.getBnCinema().getNumeEveniment());
                ticket.setData(r.getBnCinema().getData());
                ticket.setCapacitate(r.getBnCinema().getCapacitate());
                ticket.setTipBilet("Bilet Normal");

             }else if(r.getBnConcert()!=null){
                 ticket.setLocatie(r.getBnConcert().getLocatie());
                 ticket.setNumeEveniment(r.getBnConcert().getNumeEveniment());
                 ticket.setData(r.getBnConcert().getData());
                 ticket.setCapacitate(r.getBnConcert().getCapacitate());
                 ticket.setTipBilet("Bilet Normal");

             }else if(r.getBnTeatru()!=null){
                 ticket.setLocatie(r.getBnTeatru().getLocatie());
                 ticket.setNumeEveniment(r.getBnTeatru().getNumeEveniment());
                 ticket.setData(r.getBnTeatru().getData());
                 ticket.setCapacitate(r.getBnTeatru().getCapacitate());
                 ticket.setTipBilet("Bilet Normal");

             }else if(r.getVipCinema()!=null){
                 ticket.setLocatie(r.getVipCinema().getLocatie());
                 ticket.setNumeEveniment(r.getVipCinema().getNumeEveniment());
                 ticket.setData(r.getVipCinema().getData());
                 ticket.setCapacitate(r.getVipCinema().getCapacitate());
                 ticket.setTipBilet("Bilet VIP");

             }else if(r.getVipConcert()!=null){
                 ticket.setLocatie(r.getVipConcert().getLocatie());
                 ticket.setNumeEveniment(r.getVipConcert().getNumeEveniment());
                 ticket.setData(r.getVipConcert().getData());
                 ticket.setCapacitate(r.getVipConcert().getCapacitate());
                 ticket.setTipBilet("Bilet VIP");

             }else{

                 ticket.setLocatie(r.getVipTeatru().getLocatie());
                 ticket.setNumeEveniment(r.getVipTeatru().getNumeEveniment());
                 ticket.setData(r.getVipTeatru().getData());
                 ticket.setCapacitate(r.getVipTeatru().getCapacitate());
                 ticket.setTipBilet("Bilet VIP");
             }
            }
            rezervarileMele.add(ticket);
        }

        model.addAttribute("reservations", rezervarileMele);

        return "events/reservation";
    }


}
