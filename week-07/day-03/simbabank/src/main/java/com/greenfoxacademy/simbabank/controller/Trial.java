package com.greenfoxacademy.simbabank.controller;

import com.greenfoxacademy.simbabank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Trial {

    @RequestMapping("/web/trial")
    public String trial() {
        return "trials";
    }
}
