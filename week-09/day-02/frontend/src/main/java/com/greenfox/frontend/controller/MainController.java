package com.greenfox.frontend.controller;

import com.greenfox.frontend.error.ErrorMessage;
import com.greenfox.frontend.model.Doubled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping({"/"})
    public String initial(){
        return "index";
    }
}


