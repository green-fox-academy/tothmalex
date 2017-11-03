package com.greenfox.todolistmysql.controllers;

import com.greenfox.todolistmysql.model.Todo;
import com.greenfox.todolistmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todorepo;

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todo", todorepo.findAll());
        return "todo";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("todo", new Todo());
        return "create";
    }

    @PostMapping("/add")
    public String dataSubmit(@ModelAttribute Todo todo) {
        todorepo.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todorepo.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Todo todo = todorepo.findOne(id);
        model.addAttribute("todo", todo);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Long id,
                         @RequestParam("title") String title,
                         @RequestParam(value="urgent", required=false) boolean urgent,
                         @RequestParam(value = "done", required = false) boolean done) {
        Todo todo = todorepo.findOne(id);
        todo.setTitle(title);
        todo.setDone(done);
        todo.setUrgent(urgent);
        todorepo.save(todo);
        return "redirect:/todo/list";
    }
}