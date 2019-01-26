package pl.oskarpolak.phonebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.phonebook.models.AddContactForm;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("addContactForm", new AddContactForm());
        return "index";
    }


    @PostMapping("/")
    @ResponseBody
    public String index(@ModelAttribute AddContactForm addContactForm) {
        System.out.println("tutaj bedzie logika zapisu do bazy");
        return "Dodano kontakt!";
    }



}
