package com.Quotes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class QuotesConfig {
    @Bean
    CommandLineRunner commandLineRunner6(QuotesRepository quotesRepository){
        return args -> {
            Quotes quote1 = new Quotes(
                    4L,
                    "Happiness is not a possession to be prized, it is a quality of thought, a state of mind."
            );
            Quotes quote2 = new Quotes(
                    5L,
                    "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife."
            );
            Quotes quote3 = new Quotes(
                    15L,
                    "Monsters are real. Ghosts are too. They live inside of us, and sometimes, they win."
            );
            Quotes quote4 = new Quotes(
                    20L,
                    "Heartbreak is a loss. Divorce is a piece of paper."
            );
            Quotes quote5 = new Quotes(
                    21L,
                    "Deep in the human unconscious is a pervasive need for a logical universe that makes sense. But the real universe is always one step beyond logic."
            );
            Quotes quote6 = new Quotes(
                    6L,
                    "People without a sense of humor will never forgive you for being funny."
            );
            quotesRepository.saveAll(
                    Arrays.asList(quote1, quote2, quote3, quote4, quote5, quote6)
            );
        };
    }
}
