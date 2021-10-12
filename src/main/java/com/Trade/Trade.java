package com.Trade;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "trade")
public class Trade {
    @Id
    @SequenceGenerator(
            name = "trade_sequence",
            sequenceName = "trade_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "trade_sequence"
    )

    Long id;
    Long userId;
    Long bookId;
    boolean availableToTrade;

    public Trade() {

    }

    public Trade(Long id, Long userId, Long bookId, boolean availableToTrade) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.availableToTrade = availableToTrade;
    }

    public Trade(Long userId, Long bookId, boolean availableToTrade) {
        this.userId = userId;
        this.bookId = bookId;
        this.availableToTrade = availableToTrade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public boolean isAvailableToTrade() {
        return availableToTrade;
    }

    public void setAvailableToTrade(boolean availableToTrade) {
        this.availableToTrade = availableToTrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return availableToTrade == trade.availableToTrade && Objects.equals(id, trade.id) && Objects.equals(userId, trade.userId) && Objects.equals(bookId, trade.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, bookId, availableToTrade);
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", availableToTrade=" + availableToTrade +
                '}';
    }
}