package com.example.springbootdockercomposejenkins.ru.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "cost_book")
    private int cost;

    public Book(String name, String author, int cost) {
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public Book() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
