package com.ximple_library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ximple_library.enums.BookGenre;
import com.ximple_library.model.Book;
import com.ximple_library.model.Author;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findBookById(Long id);
    Optional<List<Book>> findBookByTitle(String title);
    // Optional<List<Book>> findBookByAuthor(Author author);
    Optional<List<Book>> findBookByGenre(BookGenre genre);
}
