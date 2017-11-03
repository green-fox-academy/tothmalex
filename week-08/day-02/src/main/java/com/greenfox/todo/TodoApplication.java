package com.greenfox.todo;

		import com.greenfox.todo.model.ToDo;
		import com.greenfox.todo.repository.Repo;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	Repo repo;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new ToDo("It must be done"));
	}
}
