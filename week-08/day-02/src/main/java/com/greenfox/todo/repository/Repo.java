package com.greenfox.todo.repository;

import com.greenfox.todo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<ToDo, Long> {

}
