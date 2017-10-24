package Name.com.greenfoxacademy.springstart.controller;

import Name.com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/")
    public Greeting greeting(){
        Greeting mess = new Greeting(01,"Hey guys!");
        return mess;
    }
}
