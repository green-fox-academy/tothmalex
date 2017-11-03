package com.greenfox.todosql.repository;

import com.greenfox.todosql.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<ToDo, Long> {

}
