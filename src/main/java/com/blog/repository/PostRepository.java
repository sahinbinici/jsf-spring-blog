package com.blog.repository;

import com.blog.domain.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {
    public Post findByTitleIgnoreCase(String title);
}
