package com.greenfox.reddit;

import com.greenfox.reddit.model.Reddit;
import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner{

	@Autowired
	RedditRepository redditrepo;


	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		redditrepo.save(new Reddit(34,"Let's see!"));
		redditrepo.save(new Reddit(12,"We will see"));
		redditrepo.save(new Reddit(5,"Looking at..."));
	}
}
