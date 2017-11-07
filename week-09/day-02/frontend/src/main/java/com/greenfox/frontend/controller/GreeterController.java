package com.greenfox.frontend.controller;

import com.greenfox.frontend.model.Greeter;
import com.greenfox.frontend.error.GreetingError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class GreeterController {

        @GetMapping("/greeter")
        public Greeter greeter( @RequestParam("name") String name, @RequestParam("title") String title) {
            Greeter g = new Greeter(name, title);
            return g;
        }

        @ExceptionHandler(MissingServletRequestParameterException.class)
        public GreetingError error( MissingServletRequestParameterException ex){
            String exception_type = ex.getParameterName();

            return new GreetingError(exception_type);
        }
    }
