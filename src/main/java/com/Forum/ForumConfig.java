package com.Forum;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class ForumConfig {
    @Bean
    CommandLineRunner commandLineRunner5(ForumRepository forumRepository){
        return args -> {
            Forum post1 = new Forum(
                    2L,
                    10L,
                    "This month's book was boring!"
            );
            Forum post2 = new Forum(
                    1L,
                    10L,
                    "Loved every page!"
            );
            Forum post3 = new Forum(
                    3L,
                    10L,
                    "Could take or leave this month's book."
            );
            forumRepository.saveAll(
                    Arrays.asList(post1, post2, post3)
            );
        };
    }
}
