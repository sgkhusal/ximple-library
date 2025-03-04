package com.ximple_library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ximple_library.enums.Language;
import com.ximple_library.model.Book;
import com.ximple_library.model.Publisher;
import com.ximple_library.model.BookEdition;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookEditionRepository extends JpaRepository<BookEdition, Long> {
    Optional<BookEdition> findBookEditionById(Long id);
    Optional<List<BookEdition>> findBookEditionByBook(Book book);
    Optional<List<BookEdition>> findBookEditionByPublisher(Publisher publisher);
    Optional<List<BookEdition>> findBookEditionByLanguage(Language language);
}
