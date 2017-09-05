package io.springtrainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model){
        String name = "John";

        model.addAttribute("name", name);
        return "about";
    }

}
