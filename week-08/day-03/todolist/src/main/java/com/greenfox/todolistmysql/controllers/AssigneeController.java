package com.greenfox.todolistmysql.controllers;

import com.greenfox.todolistmysql.model.Assignee;
import com.greenfox.todolistmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

    @Autowired
    private AssigneeRepository assigneerepo;

    @GetMapping({"/assignee"})
    public String assigneeList(Model model) {
        model.addAttribute("assignee", assigneerepo.findAll());
        return "assignee";
    }

    @GetMapping("/assigneecreate")
    public String create(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "assigneecreate";
    }

    @PostMapping("/assigneeadd")
    public String dataSubmit(@ModelAttribute Assignee assignee) {
        assigneerepo.save(assignee);
        return "redirect:/todo/assignee";
    }

    @GetMapping("/{id}/assigneedelete")
    public String delete(@PathVariable Long id) {
        assigneerepo.delete(id);
        return "redirect:/todo/assigne";
    }

    @GetMapping("/{id}/assigneeedit")
    public String edit(@PathVariable Long id, Model model) {
        Assignee assignee = assigneerepo.findOne(id);
        model.addAttribute("assignee", assignee);
        return "assigneeedit";
    }

    @PostMapping("/assigneeupdate")
    public String update(@RequestParam("id") Long id,
                         @RequestParam("name") String name,
                         @RequestParam("email") String email) {
        Assignee assignee = assigneerepo.findOne(id);
        assignee.setName(name);
        assignee.setEmail(email);
        assigneerepo.save(assignee);
        return "redirect:/todo/assignee";
    }
}