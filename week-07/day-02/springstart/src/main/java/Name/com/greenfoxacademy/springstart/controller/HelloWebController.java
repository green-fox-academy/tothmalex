package Name.com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("web", " World");
        return "Hello, " + model.input2 + "! (It is a " + model.input1 + " page.)";
    }
}
