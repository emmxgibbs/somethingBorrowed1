package com.Trade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TradeRepository
        extends JpaRepository<Trade, Long> {

    Optional<Trade> getTradeById(Long id);

    @Query(value = "SELECT * FROM trade INNER JOIN book ON trade.book_id = book.id \n" +
            "WHERE user_id = ?1", nativeQuery = true)
    Optional<List<Trade>> getUsersBookToTrade(Long userId);

    @Query(value = "SELECT * FROM trade INNER JOIN book ON trade.book_id = book.id \n" +
            "EXCEPT \n" +
            "SELECT * FROM trade INNER JOIN book ON trade.book_id = book.id WHERE trade.user_id = ?1", nativeQuery = true)
    Optional<List<Trade>> getAvailableBooksToTrade(Long userId);

    @Query(value = "SELECT * FROM trade WHERE user_id = ?1 AND book_id = ?2", nativeQuery = true)
    Optional<Trade> getTradeByUser(Long userId, Long bookId);

}
