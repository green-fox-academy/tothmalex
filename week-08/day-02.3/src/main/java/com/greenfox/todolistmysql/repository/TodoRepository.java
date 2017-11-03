package com.greenfox.todolistmysql.repository;

import com.greenfox.todolistmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}