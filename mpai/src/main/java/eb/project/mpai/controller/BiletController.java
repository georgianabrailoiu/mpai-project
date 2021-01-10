package eb.project.mpai.controller;

import eb.project.mpai.domain.*;
import eb.project.mpai.domain.bilete.BiletNormalCinema;
import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.enums.TipBilet;
import eb.project.mpai.domain.interfaces.Eveniment;
import eb.project.mpai.dto.Bilet;
import eb.project.mpai.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    private RezervareService rezervareService;

    @Autowired
    private UtilizatorService utilizatorService;

    private AbstractFactory abstractFactory;
    private Eveniment eveniment;
    private Tip tipEveniment;
    private TipBilet tipBilet;
    Rezervare rezervare = new Rezervare();

    @GetMapping("/user/events/ticket")
    public String getTypeTicket(Model model) {
        Bilet ticket = new Bilet();
        model.addAttribute("ticket", ticket);
        return "events/ticket";
    }

    @PostMapping("/user/events/list")
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
                case "CINEMA":
//                    model.addAttribute("events", );
                    break;
                case "TEATRU":
//                    model.addAttribute("events", );
                    break;
                case "CONCERT":
//                    model.addAttribute("events", );
                    break;
            }
        }
        return "events/list";
    }

    @GetMapping("/user/events/view/{id}")
    public String addTicket(@PathVariable(value = "id") Long id, Model model) {
        if(tipBilet.equals(TipBilet.NORMAL)){
            switch (tipEveniment){
                case Cinema:
                    BiletNormalCinema bnCinema= biletNormalCinemaService.findById(id).get();
                    rezervare.setBnCinema(bnCinema);
                    break;
                case Concert:
                    BiletNormalConcert bnConcert = biletNormalConcertService.findById(id).get();
                    rezervare.setBnConcert(bnConcert);
                    break;
                case Teatru:
                    BiletNormalTeatru bnTeatru = biletNormalTeatruService.findById(id).get();
                    rezervare.setBnTeatru(bnTeatru);
                    break;
            }
        }else{
            switch (tipEveniment){
                case Cinema:
                    break;
                case Concert:
                    break;
                case Teatru:
                    break;
            }
        }
        BiletNormalCinema biletNormalCinema = biletNormalCinemaService.findById(id).get();
        Utilizator utilizator = utilizatorService.findById(Long.valueOf(1)).get();
        rezervare.setUtilizator(utilizator);
        model.addAttribute("event", biletNormalCinema);

        Bilet inregistrareDateFinaleRezervare = new Bilet();
        model.addAttribute("finalData", inregistrareDateFinaleRezervare);
        return "events/view";
    }

    @PostMapping("/user/newreservation")
    public String addEvent(@ModelAttribute Bilet bilet, Model model) {
        rezervare.setLoc(Integer.parseInt(bilet.getLoc()));
        rezervareService.addRezervare(rezervare);

        return "events/reservation";
    }
}
