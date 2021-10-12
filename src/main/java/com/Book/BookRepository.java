package com.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "SELECT * FROM book ORDER BY title", nativeQuery = true)
    Optional<List<Book>> getBooksAlphabetically();

    @Query(value = "SELECT * FROM book WHERE title = ?1", nativeQuery = true)
    Optional<Book> getBookByTitle(String title);

    //write more specific db methods here
    @Query(value = "SELECT * FROM book WHERE genre = ?1", nativeQuery = true)
    Optional<List<Book>> getBookByGenre(String genre);

    @Query(value = "SELECT * FROM book WHERE author = ?1", nativeQuery = true)
    Optional<List<Book>> getBookByAuthor(String author);

    @Query(value = "SELECT * FROM book INNER JOIN trade ON book.id = trade.book_id \n" +
            "WHERE user_id = ?1", nativeQuery = true)
    Optional<List<Book>> getUsersBookToTrade(Long userId);

    @Query(value = "SELECT * FROM book INNER JOIN trade ON book.id = trade.book_id \n" +
            "EXCEPT \n" +
            "SELECT * FROM book INNER JOIN trade ON book.id = trade.book_id WHERE trade.user_id = ?1", nativeQuery = true)
    Optional<List<Book>> getAvailableBooksToTrade(Long userId);


}
