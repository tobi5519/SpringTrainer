package io.springtrainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    int num = 0;

    @GetMapping("/")
    public String index(Model model){
        num++;

        model.addAttribute("num", num);
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model){
        String name = "John";

        model.addAttribute("name", name);
        return "about";
    }

}
