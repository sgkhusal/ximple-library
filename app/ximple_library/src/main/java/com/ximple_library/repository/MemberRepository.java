package com.ximple_library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ximple_library.model.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findMemberById(Long id);
    Optional<Member> findMemberByEmail(String email);
    Optional<Member> findMemberByDocument(String document);
    Optional<Member> findMemberByPhoneNumber(String phoneNumber);

}
