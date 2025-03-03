package com.ximple_library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.ximple_library.model.Author;
import com.ximple_library.enums.BookGenre;

@Entity
@Table(name="book")
@Getter
@Setter
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="book_sequence")
    private Long id;

    @Column(unique=true)
    private String ISBN;
    @Column(unique=true)
    private String ISSN;

    @ManyToMany
    @JoinColumn(name="author_id")
    private Author authors;

    // could be a ManyToMany field
    @Enumerated(EnumType.STRING)
    private BookGenre genre;
}
