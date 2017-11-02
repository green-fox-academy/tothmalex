package com.greenfox.todo;

public class ToDo {

    int id;
    String title;
    boolean isUrgent = false;
    boolean isDone = false;

    public ToDo(int id, String title, boolean isUrgent, boolean isDone) {
        this.id = id;
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
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
