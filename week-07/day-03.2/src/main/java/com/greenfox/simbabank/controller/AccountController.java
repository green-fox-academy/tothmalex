package com.greenfox.simbabank.controller;

import com.greenfox.simbabank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class AccountController {

    @RequestMapping("/accounts")
    public String newAccount(Model model) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add( new BankAccount("Pumba", 2344, "warthog", false, true));
        accounts.add(new BankAccount("Nala", 4500, "lion", false, false));
        accounts.add(new BankAccount("Timon", 1500, "meerkat", true, false));
        model.addAttribute("accounts", accounts);

        return "bankaccounts";
    }
}
