package com.deusley.api_comment_client.service;

import com.deusley.api_comment_client.domain.Comment;

public interface CommentService {

    Comment create (Comment comment);

    Comment findById(String id);

    void delete(Integer id);
}
