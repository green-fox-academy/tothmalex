package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByScoreDesc();
}
