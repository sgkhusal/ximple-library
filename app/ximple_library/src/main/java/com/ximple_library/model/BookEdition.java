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
import com.ximple_library.model.Publisher;
import com.ximple_library.enums.Language;

@Entity
@Table(name="book_edition")
@Getter
@Setter
@AllArgsConstructor
public class BookEdition {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name="publisher_id")
    private Publisher publisher;

    private int year;
    private int editionNumber;
    private int pages;

    @Enumerated(EnumType.STRING)
    private Language language;
}
