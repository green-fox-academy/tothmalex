package com.greenfox.todoapp;

import java.util.List;

public interface Persistance {

    void save(Task todo);
    void saveAll(List<Task> todoList);
    Task load(int id);
    Task load(String name);
    List<Task> loadAll();

}