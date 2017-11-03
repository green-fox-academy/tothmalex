package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Reddit;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository<Reddit, Long> {

}
