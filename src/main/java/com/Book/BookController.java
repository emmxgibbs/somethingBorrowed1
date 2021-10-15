package com.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "somethingBorrowed/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping(path = "abc")
    public Optional<List<Book>> getBooksAlphabatically(){
        return bookService.getBooksAlphabetically();
    }

    @GetMapping (path = "filterGenre/{genre}")
    public Optional<List<Book>> getBooksByGenre(@PathVariable("genre") String genre) {
        return bookService.getBooksByGenre(genre);
    }

    @GetMapping (path = "filterTitle/{title}")
    public Optional<Book> getBookByTitle(@PathVariable("title") String title) {
        return bookService.getBookByTitle(title);
    }

    @GetMapping (path = "filterAuthor/{author}")
    public Optional<List<Book>> getBookByAuthor(@PathVariable("author") String author) {
        return bookService.getBooksByAuthor(author);
    }

    //Adding new books
    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping (path = "{bookId}")
    public void deleteBook(@PathVariable("bookId") Long bookId){
        bookService.deleteBook(bookId);
    }

    @PutMapping (path = "rating")
    public void updateRating(@RequestParam String bookTitle, @RequestParam Double rating){
        bookService.updateRating(bookTitle, rating);
    }

    @PutMapping (path = "{bookId}")
    public void updateBook(@PathVariable("bookId") Long bookId, @RequestBody Book book){
        bookService.updateBook(bookId, book);
    }
}
