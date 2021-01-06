package eb.project.mpai.controller;

import eb.project.mpai.domain.Utilizator;
import eb.project.mpai.service.interfaces.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @Autowired
    private UtilizatorService utilizatorService;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Utilizator());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Utilizator greeting, Model model) {
        utilizatorService.addUtilizator(greeting);
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
