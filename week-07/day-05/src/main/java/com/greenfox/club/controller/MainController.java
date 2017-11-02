package com.greenfox.club.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/intro")
    public String intro (){
        return "index";
    }
}
