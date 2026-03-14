package com.example.controller;

import com.example.model.Book;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    // 1. /welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System!";
    }

    // 2. /count
    @GetMapping("/count")
    public int count() {
        return 1000;
    }

    // 3. /price
    @GetMapping("/price")
    public double price() {
        return 29.99;
    }

    // 4. /books
    @GetMapping("/books")
    public List<String> books() {
        return List.of("Spring in Action", "Effective Java", "Clean Code");
    }

    // 5. /books/{id}
    @GetMapping("/books/{id}")
    public String bookById(@PathVariable int id) {
        return "Book ID: " + id + ", Title: Spring Boot in Practice";
    }

    // 6. /search?title=...
    @GetMapping("/search")
    public String search(@RequestParam String title) {
        return "Searching for: " + title;
    }

    // 7. /author/{name}
    @GetMapping("/author/{name}")
    public String author(@PathVariable String name) {
        return "Author: " + name + " - Books available!";
    }

    // 8. /addbook POST JSON
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        book.setId(nextId++);
        books.add(book);
        return "Added: " + book;
    }

    // 9. /viewbooks
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return new ArrayList<>(books);
    }
}
