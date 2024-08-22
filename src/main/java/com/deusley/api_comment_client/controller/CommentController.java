package com.deusley.api_comment_client.controller;


import com.deusley.api_comment_client.controller.request.CommentsRequest;
import com.deusley.api_comment_client.domain.Comment;
import com.deusley.api_comment_client.mapper.CommentMapper;
import com.deusley.api_comment_client.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/comments/")
public class CommentController {

    @Autowired
    private CommentService service;

    @Autowired
    private CommentMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Comment create(@RequestBody CommentsRequest commentsRequest) {
        var comments = mapper.toCommentsRequest(commentsRequest);
        service.create(comments);
        return comments;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Comment findById(@PathVariable("id") String id) {
        return service.findById(id);

    }
}