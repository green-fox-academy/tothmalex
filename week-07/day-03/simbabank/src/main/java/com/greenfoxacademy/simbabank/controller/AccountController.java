package com.greenfoxacademy.simbabank.controller;

import com.greenfoxacademy.simbabank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AccountController {

    @RequestMapping("/web")
    public String newAccount(Model model) {
        model.addAttribute("name", "Simba");
        model.addAttribute("balance", 2000);
        model.addAttribute("animalType", "lion");
        return "lionking";
    }
}



 /*   @RequestMapping(value = "/web")
    public BankAccount opening() {
        BankAccount simba = new BankAccount("Simba", 2000, "lion");
        return simba;
    }
}
*/