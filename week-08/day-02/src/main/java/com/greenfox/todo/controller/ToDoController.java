package com.greenfox.todo.controller;

import com.greenfox.todo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private Repo repo;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("todos",repo.findAll());
        return "todolist";
    }
}
