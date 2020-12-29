package eb.project.mpai.controller;

import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.service.interfaces.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UtilizatorController {

    @Autowired
    private UtilizatorService utilizatorService;

    @GetMapping("/users")
    public String findCities(Model model) {

        List<Utilizator> utilizatori = utilizatorService.findAll();

        model.addAttribute("user", utilizatori.get(0));

        return "users";
    }
}