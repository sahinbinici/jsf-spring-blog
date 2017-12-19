package com.blog.service.jpa;

import com.blog.service.CommentService;
import com.blog.domain.Comment;
import com.blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("commentService")
@Repository
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    @Transactional(readOnly = true)
    public Comment findById(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Comment> findByTextIgnoreCase(String text) {
        return commentRepository.findByTextIgnoreCase(text);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void destroy(Comment comment) {
        commentRepository.delete(comment);
    }
}
