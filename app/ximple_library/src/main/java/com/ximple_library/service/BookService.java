package com.ximple_library.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.ximple_library.enums.BookGenre;
import com.ximple_library.model.Author;
import com.ximple_library.model.Book;
import com.ximple_library.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    @Autowired
    private final BookRepository repository;

    Optional<Book> findBookById(Long id) {
        return this.repository.findBookById(id);
    };

    Optional<List<Book>> findBookByTitle(String title) {
        return this.repository.findBookByTitle(title);
    };

    // Optional<List<Book>> findBookByAuthor(Author author) {
    //     return this.repository.findBookByAuthor(author);
    // };

    Optional<List<Book>> findBookByGenre(BookGenre genre) {
        return this.repository.findBookByGenre(genre);
    };

    public void save(Book book) {
        this.repository.save(book);
    }
}
