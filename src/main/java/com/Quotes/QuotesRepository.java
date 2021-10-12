package com.Quotes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuotesRepository
        extends JpaRepository<Quotes, Long> {

    Optional<Quotes> getQuoteById(Long id);

}

