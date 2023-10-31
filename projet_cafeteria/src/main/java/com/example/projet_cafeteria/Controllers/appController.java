package com.example.projet_cafeteria.Controllers;

import com.example.projet_cafeteria.models.login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class appController {
    @GetMapping("/")
    public String loginPage(Model model) {
        // Add any necessary model attributes here
        //String message = "my first message";
        model.addAttribute("login", new login());
        return "log";
    }
    @GetMapping("/home")
    public String homePage(Model model){
        String message = "Page d'acceuil";
        model.addAttribute("message", message);
        return "home";
    }


}
