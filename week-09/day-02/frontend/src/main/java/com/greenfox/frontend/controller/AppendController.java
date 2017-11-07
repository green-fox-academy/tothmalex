package com.greenfox.frontend.controller;

import com.greenfox.frontend.model.Appender;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppendController {

    @GetMapping("/appenda/{appendable}")
    public Appender appending(  @PathVariable("appendable") String appendable) {
        Appender a = new Appender(appendable);
        return a;
    }
}
