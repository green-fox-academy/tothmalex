package com.greenfox.frontend.controller;

import com.greenfox.frontend.error.ErrorMessage;
import com.greenfox.frontend.model.DoUntil;
import com.greenfox.frontend.model.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @RequestMapping(value ="/dountil/{what}", method= RequestMethod.POST)
    public DoUntil dountil (@PathVariable("what") String what, @RequestBody Until until){
        DoUntil dountil = new DoUntil(until.getUntil(), what);
        return dountil;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorMessage error(){
        return new ErrorMessage("Please provide a number!");
    }
}