package com.greenfox.frontend.controller;

import com.greenfox.frontend.model.Doubled;
import com.greenfox.frontend.error.DoublingError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DoublingController {

    @GetMapping("/doubling")
    public Doubled doubler(@RequestParam("input") int input) {
        Doubled doubled = new Doubled();
        doubled.received = input;
        doubled.result = doubled.doubling(input);
        return doubled;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public DoublingError error() {
        return new DoublingError("Please provide an input!");
    }
}
