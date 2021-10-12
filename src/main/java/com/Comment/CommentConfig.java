package com.Comment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class CommentConfig {
    @Bean
    CommandLineRunner commandLineRunner2(CommentRepository commentRepository){
        return args -> {
            Comment comment1 = new Comment(
                    2L,
                    3L,
                    "Absolutely loved this book - so magical!!"
            );
            Comment comment2 = new Comment(
                    1L,
                    3L,
                    "Great book!"
            );
            Comment comment3 = new Comment(
                    2L,
                    5L,
                    "Rubbish book!"
            );
            commentRepository.saveAll(
                    Arrays.asList(comment1, comment2, comment3)
            );
        };
    }
}
