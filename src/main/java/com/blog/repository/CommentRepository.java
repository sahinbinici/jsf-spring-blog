package com.blog.repository;

import com.blog.domain.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CommentRepository extends CrudRepository<Comment, Long> {
    public List<Comment> findByTextIgnoreCase(String text);
}
