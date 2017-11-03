package com.greenfox.todosql;

import com.greenfox.todosql.model.ToDo;
import com.greenfox.todosql.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqlApplication implements CommandLineRunner{

	@Autowired
	Repo repo;

	public static void main(String[] args) {
		SpringApplication.run(TodosqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new ToDo("5It is done, almost", true, true));
	}
}
