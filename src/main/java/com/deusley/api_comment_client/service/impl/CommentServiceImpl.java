package com.deusley.api_comment_client.service.impl;


import com.deusley.api_comment_client.domain.Comment;
import com.deusley.api_comment_client.mapper.CommentMapper;
import com.deusley.api_comment_client.repository.CommentRepository;
import com.deusley.api_comment_client.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository repository;

    @Autowired
    private CommentMapper commentMapper;


    @Override
    public Comment create(Comment comment) {

        var commentEntity = commentMapper.toCommentEntity(comment);
        repository.save(commentEntity);
        return comment;
    }
    @Override
    public Comment findById(String id) {
        var comments = repository.findById(id)
                .map(commentMapper::toComment)
                .orElseThrow(RuntimeException::new);
        return comments;
    }
    @Override
    public List<Comment> findAll() {
        var allComments = repository.findAll();
        return allComments.stream().map(commentMapper::toComment).toList();
    }
}