package com.ranbom.testmerge.controller;


import com.ranbom.testmerge.domain.po.BookPO;
import com.ranbom.testmerge.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookPO>> all() {
        return new ResponseEntity<>(bookService.list(), HttpStatus.OK);
    }

}
