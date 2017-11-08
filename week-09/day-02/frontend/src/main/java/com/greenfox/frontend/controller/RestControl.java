package com.greenfox.frontend.controller;

import com.greenfox.frontend.error.ErrorMessage;
import com.greenfox.frontend.model.Appender;
import com.greenfox.frontend.model.Doubled;
import com.greenfox.frontend.model.Greeter;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestControl {

    @GetMapping("/doubling")
    public Object doubler( @RequestParam(required = false) Integer input ) {

        if (input == null) {
            return new ErrorMessage("Please provide a number!");
        } else {
            Doubled doubled = new Doubled(input, input * 2);
            return doubled;
        }
    }

    @GetMapping("/greeter")
    public Object greeter( @RequestParam(required = false) String name, @RequestParam String title) {

        if (name == null) {
            return new ErrorMessage("Please provide a name!");
        } else {
            Greeter g = new Greeter(name, title);
            return g;
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Object appending( @PathVariable(required = false) String appendable) {

        if (appendable == null) {
            return new ErrorMessage("404");
        } else {
            Appender a = new Appender(appendable);
            return a;
        }
    }
}

