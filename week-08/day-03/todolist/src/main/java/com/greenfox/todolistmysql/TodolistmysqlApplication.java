package com.greenfox.todolistmysql;

import com.greenfox.todolistmysql.model.Assignee;
import com.greenfox.todolistmysql.model.Todo;
import com.greenfox.todolistmysql.repository.AssigneeRepository;
import com.greenfox.todolistmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistmysqlApplication implements CommandLineRunner {

	@Autowired
	TodoRepository repo;
	AssigneeRepository assigneeRepo;

	public static void main(String[] args) {
		SpringApplication.run(TodolistmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Todo("3It is done, almost"));
		repo.save(new Todo("It s getting closer"));
		repo.save(new Todo("Hopefully it is.."));
		//assigneeRepo.save(new Assignee("Janika", "ordeguzo.edit@freemail.hu"));
		//assigneeRepo.save(new Assignee("Laca", "apuka.laci@gmail.com"));
	}
}