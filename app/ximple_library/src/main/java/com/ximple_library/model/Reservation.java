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

import java.time.LocalDate;

import com.ximple_library.model.Member;
import com.ximple_library.model.BookCopy;
import com.ximple_library.enums.ReservationStatus;

@Entity
@Table(name="reservation")
@Getter
@Setter
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="book_copy_id")
    private BookCopy book;
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;

    private LocalDate availableDate;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
