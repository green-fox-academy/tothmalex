package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Reddit;
import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/reddit")
public class Controller {

    @Autowired
    private RedditRepository redditrepo;

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("reddits", redditrepo.findAll());
        return "reddit";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("reddit", new Reddit());
        return "create";
    }

    @PostMapping("/add")
    public String greetingSubmit(@ModelAttribute Reddit reddit) {
        redditrepo.save(reddit);
        return "redirect:/reddit/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        redditrepo.delete(id);
        return "redirect:/reddit/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Reddit reddit = redditrepo.findOne(id);
        model.addAttribute("reddit", reddit);
        return "edit";
    }

    @PostMapping("/{id}/upvote")
    public String upvote(@RequestParam("id") Long id)
    {
        Reddit reddit = redditrepo.findOne(id);
        reddit.setScore(reddit.getScore()+1);
        redditrepo.save(reddit);
        return "redirect:/reddit/list";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Long id,
                         @RequestParam("score") int score,
                         @RequestParam("content") String content)
                          {
        Reddit reddit = redditrepo.findOne(id);
        reddit.setScore(score);
        reddit.setContent(content);
        redditrepo.save(reddit);
        return "redirect:/reddit/list";
    }
}