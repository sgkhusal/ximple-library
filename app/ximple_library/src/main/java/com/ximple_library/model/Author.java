package com.ximple_library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Entity
@Table(name="author")
@Getter
@Setter
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="author_sequence")
    private Long id;

    private String firstName;
    private String lastName;
    private String nationality;
}
