package com.greenfox.frontend.controller;

import com.greenfox.frontend.error.ErrorMessage;
import com.greenfox.frontend.model.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestControl {

    @GetMapping("/doubling")
    public Object doubler( @RequestParam(required = false) Integer input ) {

        if (input == null) {
            return new ErrorMessage("Please provide an input!");
        } else {
            Doubled doubled = new Doubled(input, input * 2);
            return doubled;
        }
    }

    @GetMapping("/greeter")
    public Object greeter( @RequestParam(required = false) String name, @RequestParam (required = false) String title) {

        if (name == null && title == null) {
            return new ErrorMessage("Please provide a name and a title!");
        } else if (title == null) {
            return new ErrorMessage("Please provide a title!");
        } else if (name == null){
            return new ErrorMessage("Please provide a name!");
        } else if (name != null && name != null){
            Greeter g = new Greeter(name, title);
            return g;
        } return null;
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

    @RequestMapping(value ="/dountil/{what}", method= RequestMethod.POST)
    public Object dountil ( @PathVariable("what") String what, @RequestBody Until until){

        if (until.getUntil() != 0) {
            DoUntil dountil = new DoUntil(until.getUntil(), what);
            return dountil;
        } else {
            return new ErrorMessage("Please provide a number!");
        }
    }
}

