package com.greenfox.frontend.controller;

import com.greenfox.frontend.error.ErrorMessage;
import com.greenfox.frontend.model.Doubled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @GetMapping("/doublingtrial")
    public Object doubler( @RequestParam(required = false) Integer input ) {

        if (input == null) {
            return new ErrorMessage("Please provide a number!");
        } else {
            Doubled doubled = new Doubled(input, input * 2);
            return doubled;
        }
    }
}
