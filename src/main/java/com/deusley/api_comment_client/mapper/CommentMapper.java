package com.deusley.api_comment_client.mapper;

import com.deusley.api_comment_client.controller.request.CommentsRequest;
import com.deusley.api_comment_client.domain.Comment;
import com.deusley.api_comment_client.repository.entity.CommentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    CommentEntity toCommentEntity(Comment comment);

    Comment toComment(CommentEntity commentEntity);

    Comment toCommentsRequest(CommentsRequest commentsRequest);


}
