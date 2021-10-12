package com.Trade;

import com.Book.Book;
import com.Book.BookRepository;
import com.Book.BookService;
import com.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TradeService {
    private TradeRepository tradeRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;
    private BookService bookService;

    @Autowired
    public TradeService(TradeRepository tradeRepository, BookRepository bookRepository, UserRepository userRepository, BookService bookService) {
        this.tradeRepository = tradeRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.bookService = bookService;
    }

    public List<Trade> getTrades(){
        return tradeRepository.findAll();
    }

    @Transactional
    public Optional<List<Book>> getUserBooksToTrade(Long userId){
        boolean existsById = userRepository.existsById(userId.intValue());
        if (!existsById){
            throw new IllegalStateException("Cannot get books to trade as user ID does not exist!");
        } else {
            Optional<List<Book>> booksToTrade = bookRepository.getUsersBookToTrade(userId);
            return booksToTrade;

        }
    }

    @Transactional
    public Optional<List<Book>> getAvailableBooksToTrade(Long userId){
        boolean existsById = userRepository.existsById(userId.intValue());
        if (!existsById){
            throw new IllegalStateException("Cannot get books to trade as user ID does not exist!");
        } else {
            Optional<List<Book>> booksAvailable = bookRepository.getAvailableBooksToTrade(userId);
            return booksAvailable;

        }
    }

    public Trade addTrade(Trade trade){
        Optional<Trade> tradeOptional = tradeRepository.getTradeById(trade.getId());
        if (tradeOptional.isPresent()){
            throw new IllegalStateException("Trade with that id already exists.");
        }
        return tradeRepository.save(trade);
    }

    @Transactional
    public void addBookToTrade(Long userId, String bookName){
        //get the book from the book title
        boolean existsByUserId = userRepository.existsById(userId.intValue());
        Optional<Book> book1 = bookRepository.getBookByTitle(bookName);
        Book book2 = book1.get();
//        boolean existsByBookId = bookRepository.exists;
        if (!existsByUserId) {
            throw new IllegalStateException("User Id " + userId + " was not found");
        }

        Trade trade1 = new Trade(userId, book2.getId(), true);
        tradeRepository.save(trade1);
    }

    @Transactional
    public void deleteTrade(Long userId, String bookName){
        Optional<Book> book = bookRepository.getBookByTitle(bookName);
        Book tradeBook = book.get();
        Long bookId = tradeBook.getId();
        Optional<Trade> trade = tradeRepository.getTradeByUser(userId, bookId);
        Trade updateTrade = trade.get();
        Long tradeId = updateTrade.getId();
        boolean existsById = userRepository.existsById(userId.intValue());
        if (!existsById) {
            throw new IllegalStateException("User ID " + userId + " was not found");
        } else {
            tradeRepository.deleteById(tradeId);
        }
    }

    @Transactional
    public void updateTrade(Long userId1, String bookName1, Long userId2, String bookName2){
        Optional<Book> book1 = bookRepository.getBookByTitle(bookName1);
        Book tradeBook1 = book1.get();
        Long bookId1 = tradeBook1.getId();
        Optional<Trade> trade1 = tradeRepository.getTradeByUser(userId1, bookId1);
        Trade updateTrade1 = trade1.get();

        Optional<Book> book2 = bookRepository.getBookByTitle(bookName2);
        Book tradeBook2 = book2.get();
        Long bookId2 = tradeBook2.getId();
        Optional<Trade> trade2 = tradeRepository.getTradeByUser(userId2, bookId2);
        Trade updateTrade2 = trade2.get();

        updateTrade1.setUserId(userId2);
        tradeRepository.save(updateTrade1);
        updateTrade2.setUserId(userId1);
        tradeRepository.save(updateTrade2);

//        Trade tradeToUpdate = tradeRepository.getById(tradeId);
//
//        boolean existsById = tradeRepository.existsById(tradeId);
//        if (!existsById){
//            throw new IllegalStateException("Trade cannot be updated as id does not exist!");
//        } else {
//            tradeToUpdate.setUserId(updatedUserId);
//            System.out.println(tradeToUpdate);
//            tradeRepository.save(tradeToUpdate);
//        }
    }

}
