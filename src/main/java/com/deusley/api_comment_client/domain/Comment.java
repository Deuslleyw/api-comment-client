package com.deusley.api_comment_client.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {


    private String id;
    private String author;
    private String text;

}
