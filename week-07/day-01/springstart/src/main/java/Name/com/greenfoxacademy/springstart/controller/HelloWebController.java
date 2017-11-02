package Name.com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Modell modell) {
        modell.addAttribute("web", " World");
        return "Hello, " + modell.input2 + "! (It is a " + modell.input1 + " page.)";
    }
}
