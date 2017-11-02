package com.greenfoxacademy.simbabank.controller;

import com.greenfoxacademy.simbabank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class AccountController2 {

    @RequestMapping("/web/multiple")
    public String newAccount(Model model) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add( new BankAccount("Pumba", 2344, "pig", false, "Good One"));
        accounts.add(new BankAccount("Nala", 4500, "lion", false, "Bad Guy"));
        accounts.add(new BankAccount("Timon", 1500, "meerkat", true, "Bad Guy"));
        model.addAttribute("accounts", accounts);
        return "lionking2";
    }
}


