package com.myblog7.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
    @Table(name="comment")
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String body;

        @ManyToOne(fetch =FetchType.LAZY)//lazy will load only post table not this layer table but eager will load both
        @JoinColumn(name = "post_id",nullable = false)
        private Post post;




    }


