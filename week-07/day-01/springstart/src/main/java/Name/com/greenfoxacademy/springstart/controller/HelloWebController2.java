package Name.com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController2 {
    AtomicLong calls = new AtomicLong();

    @RequestMapping("/web/greeting2")
    public String greet(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("calls", calls.incrementAndGet());
        return "greeting2";
    }
}