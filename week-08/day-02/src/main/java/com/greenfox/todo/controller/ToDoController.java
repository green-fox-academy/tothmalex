package com.greenfox.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

    @RequestMapping("/todo")
    public String list(Model model) {
        model.addAttribute("id", id);
        id.incrementAndGet();
        model.addAttribute("title", title);
        model.addAttribute("hello", );
        model.addAttribute("style", getColour() + ";" + getSize());
        return "greeting";

}
