package com.myblog7.payload;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private  Long id;

@NotEmpty
@Size(min=2,message = "post title should be atlest 2 characters")
    private  String title;

    @NotEmpty
    @Size(min=4,message = "post description should be atlest 4 characters")

    private  String description;

    @NotEmpty
    @Size(min=5,message = "post content should be atlest 5 characters")

    private String content ;


}
