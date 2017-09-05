package io.springtrainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    /* Catch all mapping
    @RequestMapping(value="/**", method = RequestMethod.GET)
    public String handleResults() {
        return "test";
    }
    */

    //@GetMapping("/error")
    //public String error(){
    //    return "error";
    //}


}
