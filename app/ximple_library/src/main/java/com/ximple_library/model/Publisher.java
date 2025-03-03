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

import java.time.LocalDate;

@Entity
@Table(name="publisher")
@Getter
@Setter
@AllArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="publisher_sequence")
    private Long id;

    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String phoneNumber;

    private String name;
    private LocalDate registerDate;
}
