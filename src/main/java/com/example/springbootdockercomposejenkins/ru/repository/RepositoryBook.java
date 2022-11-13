package com.example.springbootdockercomposejenkins.ru.repository;

import com.example.springbootdockercomposejenkins.ru.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryBook extends JpaRepository<Book,Long> {


}
