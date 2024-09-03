package com.deusley.api_comment_client.service;

import com.deusley.api_comment_client.domain.Comment;

import java.util.List;

public interface CommentService {

    Comment create (Comment comment);

    Comment findById(String id);

    List<Comment> findAll();

}
