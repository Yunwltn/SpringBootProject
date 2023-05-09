package com.example.testproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("name","susu");
        return "greetings";
    }

    @GetMapping("/bye")
    public String byebye(Model model) {
        model.addAttribute("name","mumu");
        return "goodbye";
    }

}
