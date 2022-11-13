package com.example.springbootdockercomposejenkins.ru.controller;

import com.example.springbootdockercomposejenkins.ru.model.Book;
import com.example.springbootdockercomposejenkins.ru.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookss")
public class BookController {

    @Autowired
   private BookService bookService;

    @GetMapping("/gettt")
    public List<Book> getBooks(){
       return bookService.getAllBooks();
    }

@PostMapping("/save")
    public Book saveBook(@RequestBody Book book){

        return bookService.saveBook(book);
    }



}
