package com.ximple_library.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.ximple_library.model.Author;
import com.ximple_library.repository.AuthorRepository;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author Author) {
        return repository.save(Author);
    }

    @GetMapping
    public List<Author> listAuthors() {
        return repository.findAll();
    }
}
