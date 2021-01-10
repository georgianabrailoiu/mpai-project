package eb.project.mpai.controller;

import eb.project.mpai.domain.Rezervare;
import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.service.interfaces.RezervareService;
import eb.project.mpai.service.interfaces.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class RezervareController {

    @Autowired
    private RezervareService rezervareService;

    @Autowired
    private UtilizatorService utilizatorService;

    public Principal getPrincipal() {
        return (Principal) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
    }


    public Utilizator getLoggedInUser() {
        return utilizatorService.findByEmail(getPrincipal().getName());
    }

    public List<Rezervare> getRezervariByUserId() {
        return rezervareService.findAllByUserId(getLoggedInUser().getId());
    }


    @GetMapping("/history")
    public String findAllUsers(Model model) {

        List<Rezervare> rezervari = getRezervariByUserId();

        model.addAttribute("rezervari", rezervari.size());

        return "history";
    }
}
