package com.Trade;

import com.Book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "somethingBorrowed/trade")
public class TradeController {

    private TradeService tradeService;

    @Autowired
    public TradeController(TradeService tradeService){
        this.tradeService = tradeService;
    }

    @GetMapping
    public List<Trade> getTrade() {
        return tradeService.getTrades();
    }

    //Get list of books in users library to trade
    @GetMapping (path = "userBooks/{userId}")
    public Optional<List<Book>> getUserTrade(@PathVariable("userId") Long userId){
        return tradeService.getUserBooksToTrade(userId);
    }

    @GetMapping (path = "available/{userId}")
    public Optional<List<Book>> getOtherBooksToTrade(@PathVariable("userId") Long userId) {
        return tradeService.getAvailableBooksToTrade(userId);
    }

    @PostMapping
    public void addTrade(@RequestBody Trade trade){
        tradeService.addTrade(trade);
    }

    @PostMapping(path = "addBookToTrade/{userId}")
    public void addBookToTrade(@PathVariable("userId") Long userId, @RequestParam String bookName){
        tradeService.addBookToTrade(userId, bookName);
    }

    @PutMapping
    public void updateTrade(@RequestParam Long userId1, @RequestParam String bookName1, @RequestParam Long userId2, @RequestParam String bookName2){
        tradeService.updateTrade(userId1, bookName1, userId2, bookName2);
    }

    @DeleteMapping
    public void deleteTrade(@RequestParam Long userId, @RequestParam String bookName){
        tradeService.deleteTrade(userId, bookName);
    }

}
