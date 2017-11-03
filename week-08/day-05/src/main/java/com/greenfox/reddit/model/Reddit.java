package com.greenfox.reddit.model;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int score;
    private String content;

    public Reddit() {
    }

    public Reddit(int score, String content) {
        this.score = score;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}