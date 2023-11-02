package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    public String sample() {
        return "home";
    }
    
    @GetMapping("/aisatu")
    public String sample2() {
        return "aisatu";
    }
    
    @GetMapping("/yotei")
    public String sample3() {
        return "yotei";
    }
    @GetMapping("/sisetu")
    public String sample4() {
        return "sisetu";
    }
    @GetMapping("/otoiawase")
    public String sample5() {
        return "otoiawase";
    }
}