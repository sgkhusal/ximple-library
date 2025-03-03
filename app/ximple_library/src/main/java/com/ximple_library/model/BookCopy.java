package com.ximple_library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.ximple_library.model.Book;
import com.ximple_library.model.BookEdition;
import com.ximple_library.enums.BookCopyStatus;

@Entity
@Table(name="book_copy")
@Getter
@Setter
@AllArgsConstructor
public class BookCopy {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name="book_edition_id")
    private BookEdition edition;

    @Enumerated(EnumType.STRING)
    private BookCopyStatus status;
}
