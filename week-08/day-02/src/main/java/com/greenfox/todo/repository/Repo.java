package com.greenfox.todo;

import com.greenfox.todo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<ToDo, Long> {

}
