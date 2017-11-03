package com.greenfox.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    boolean isUrgent;
    boolean isDone;

    public ToDo () {}

    public ToDo(String title) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public boolean isDone() {
        return isDone;
    }
}
