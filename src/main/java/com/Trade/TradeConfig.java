package com.Trade;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TradeConfig {
    @Bean
    CommandLineRunner commandLineRunner3(TradeRepository tradeRepository){
        return args -> {
            Trade trade1 = new Trade(
                    1L,
                    1L,
                    true
            );
            Trade trade2 = new Trade(
                    1L,
                    2L,
                    true
            );
            Trade trade3 = new Trade(
                    1L,
                    3L,
                    true
            );
            Trade trade4 = new Trade(
                    2L,
                    5L,
                    true
            );
            tradeRepository.saveAll(
                    Arrays.asList(trade1, trade2, trade3, trade4)
            );
        };
    }
}
