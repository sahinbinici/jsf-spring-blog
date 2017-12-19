package com.blog.service;

import com.blog.domain.Post;

import java.util.List;


public interface PostService {
    public List<Post> findAll();

    public Post findById(Long id);
    public Post findByTitleIgnoreCase(String title);

    public Post save(Post post);
    public void destroy(Post post);
}
