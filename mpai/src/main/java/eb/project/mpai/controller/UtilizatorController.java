package eb.project.mpai.controller;

import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.service.interfaces.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UtilizatorController {

    @Autowired
    private UtilizatorService utilizatorService;

    @GetMapping("/users")
    public String findAllUsers(Model model) {

        List<Utilizator> utilizatori = utilizatorService.findAll();

        model.addAttribute("user", utilizatori.get(0));

        return "users";
    }

    @GetMapping("/createAccount")
    public String createAccount(Model model) {
        model.addAttribute("user", new Utilizator());
        return "createAccount";
    }

    @PostMapping("/createAccount")
    public String createAccount(@ModelAttribute Utilizator user, Model model) {
        utilizatorService.addUtilizator(user);
        model.addAttribute("user", user);
        return "result";
    }

  /*  @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("index", new Utilizator());
        return "greeting";
    }*/

}