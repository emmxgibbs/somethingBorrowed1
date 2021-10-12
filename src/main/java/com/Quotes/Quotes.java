package com.Quotes;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "quotes")
public class Quotes {
    @Id
    @SequenceGenerator(
            name = "quotes_sequence",
            sequenceName = "quotes_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quotes_sequence"
    )

    Long id;
    Long bookId;
    @Lob
    String quote;

    public Quotes() {
    }

    public Quotes(Long id, Long bookId, String quote) {
        this.id = id;
        this.bookId = bookId;
        this.quote = quote;
    }

    public Quotes(Long bookId, String quote) {
        this.bookId = bookId;
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quotes quotes = (Quotes) o;
        return Objects.equals(id, quotes.id) && Objects.equals(bookId, quotes.bookId) && Objects.equals(quote, quotes.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookId, quote);
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", quote='" + quote + '\'' +
                '}';
    }
}
