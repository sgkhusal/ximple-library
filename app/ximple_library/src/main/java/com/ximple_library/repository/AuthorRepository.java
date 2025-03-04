package com.ximple_library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ximple_library.model.Author;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findAuthorById(Long id);
    Optional<List<Author>> findAuthorByFirstName(String firstName);
    Optional<List<Author>> findAuthorByLastName(String lastName);
}
