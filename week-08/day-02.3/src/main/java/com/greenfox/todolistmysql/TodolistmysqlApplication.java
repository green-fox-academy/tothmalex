package com.greenfox.todolistmysql;

import com.greenfox.todolistmysql.model.Todo;
import com.greenfox.todolistmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistmysqlApplication implements CommandLineRunner {

	@Autowired
	TodoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TodolistmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Todo("Reddit exe"));
		repo.save(new Todo("Chapters to be read"));
		repo.save(new Todo("Consulting with Bencsikné Tóth Ica"));
		repo.save(new Todo("Final thesis"));
	}
}