package com.greenfox.todolistmysql.repository;

import com.greenfox.todolistmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
