package com.ximple_library.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.ximple_library.model.Member;
import com.ximple_library.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberRepository repository;

    public MemberController(MemberRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return this.repository.save(member);
    }

    @GetMapping
    public Optional<Member> findMember(@RequestBody String email) {
        return this.repository.findMemberByEmail(email);
    }
}
