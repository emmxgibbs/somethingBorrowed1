package com.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //returns a list from db. Look into the .findAll function, there is a sorting
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public Optional<List<Book>> getBooksAlphabetically() {
        return bookRepository.getBooksAlphabetically();
    }

    @Transactional
    public Optional<List<Book>> getBooksByGenre(String genre){
        Optional<List<Book>> booksByGenre = bookRepository.getBookByGenre(genre);
        return booksByGenre;
    }

    @Transactional
    public Optional<List<Book>> getBooksByAuthor(String author){
        Optional<List<Book>> booksByAuthor = bookRepository.getBookByAuthor(author);
        return booksByAuthor;
    }

    @Transactional
    public Optional<Book> getBookByTitle(String title){
        Optional<Book> optionalByTitle = bookRepository.getBookByTitle(title);
        return optionalByTitle;
    }

    //adds new book to db
    public Book addBook(Book book) {
        if(book == null){
            throw new IllegalArgumentException("Book cannot be null!");
        }
        if (book.getTitle() == null ||
                book.getAuthor() == null ||
                book.getBlurb() == null ||
                book.getRating() == 0 ||
                book.getIsbn() == null ||
                book.getPublisher() == null ||
                book.getBuyLink() == null ||
                book.getImageLink() == null ||
                book.getGenre() == null ||
                book.getYear() == 0){
            throw new IllegalStateException("Book cannot have empty fields.");
        }
        Optional<Book> bookOptional = bookRepository.getBookByTitle(book.getTitle());
        if (bookOptional.isPresent()){
            throw new IllegalStateException("book already exists");
        }
        System.out.println(book);

        return bookRepository.save(book);

    }

    //removes a book from the database
    public void deleteBook(Long bookId) {
        boolean existsById = bookRepository.existsById(bookId);
        if (!existsById) {
            throw new IllegalStateException("book ID " + bookId + " was not found");
        } else {
            bookRepository.deleteById(bookId);
        }
    }

    @Transactional
    public void updateRating(String bookTitle, Double rating){
        Optional<Book> book = bookRepository.getBookByTitle(bookTitle);
        Book bookToRate = book.get();
        Double bookRatingToUpdate = bookToRate.getRating();
        Double averageRating = ((bookRatingToUpdate + rating)/2);
        bookToRate.setRating(averageRating);
    }

    public void updateBook(Long bookId, Book book) {
        Book updateBook = bookRepository.getById(bookId);
        boolean existsById = bookRepository.existsById(bookId);
        if (!existsById){
            throw new IllegalStateException("Book cannot be updated as book id does not exist!");
        } else {
            updateBook.setTitle(book.getTitle());
            updateBook.setAuthor(book.getAuthor());
            updateBook.setBlurb(book.getBlurb());
            updateBook.setPublisher(book.getPublisher());
            updateBook.setYear(book.getYear());
            updateBook.setBuyLink(book.getBuyLink());
            updateBook.setImageLink(book.getImageLink());
            updateBook.setBorrowed(book.isBorrowed());
            updateBook.setIsbn(book.getIsbn());
            updateBook.setGenre(book.getGenre());

            System.out.println(updateBook);
            bookRepository.save(updateBook);
        }
    }
}
