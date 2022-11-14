package com.example.springbootdockercomposejenkins.ru.service;

import com.example.springbootdockercomposejenkins.ru.model.Book;
import com.example.springbootdockercomposejenkins.ru.repository.RepositoryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private RepositoryBook repositoryBook;

    public List<Book> getAllBooks (){

        return repositoryBook.findAll();
    }

    public Book saveBook (Book book){
        System.out.println("Всем привет, надеюсь заработает");
        System.out.println("Всем привет, УРА ЗАРАБОТАЛО!");

        return repositoryBook.save(book);
    }


    }

