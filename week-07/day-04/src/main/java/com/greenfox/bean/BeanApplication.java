package com.greenfox.bean;

import com.greenfox.bean.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanApplication implements CommandLineRunner {
	@Autowired
	HelloWorld wut;

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		wut.setMessage("Hello World");
		wut.getMessage();
	}
}