package com.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "somethingBorrowed/quotes")
public class QuotesController {

    private final QuotesService quotesService;

    @Autowired
    public QuotesController(QuotesService quotesService){
        this.quotesService = quotesService;
    }

    @GetMapping
    public List<Quotes> getQuotes() {
        return quotesService.getQuotes();
    }

}