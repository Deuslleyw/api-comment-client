package com.deusley.api_comment_client.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "COMMENTS")
public class CommentEntity {

    @MongoId
    private String id;
    private String author;
    private String text;

}
