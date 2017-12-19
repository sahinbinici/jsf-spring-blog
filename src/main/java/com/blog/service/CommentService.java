package com.blog.service;

import com.blog.domain.Comment;

import java.util.List;


public interface CommentService {

    public Comment findById(Long id);

    public List<Comment> findByTextIgnoreCase(String text);

    public void save(Comment comment);

    public void destroy(Comment comment);
}
