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
@Table(name="member")
@Getter
@Setter
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_sequence")
    private Long id;

    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String document;
    @Column(unique=true)
    private String phoneNumber;

    private String firstName;
    private String lastName;
    private String password;
    private boolean isStaff;
}
