package com.kh.petkage.repository;

import com.kh.petkage.domain.Member;
import com.kh.petkage.domain.RoleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired EntityManager em;
    @Autowired MemberRepository memberRepository;

    @BeforeEach
    public void setup() {
        Member member1 = new Member("1234", "user1", 01012341234, null, RoleType.USER, null, null);
        Member member2 = new Member("1234", "user2", 01012341234, null, RoleType.USER, null, null);
        Member member3 = new Member("1234", "user3", 01012341234, null, RoleType.USER, null, null);
        Member member4 = new Member("1234", "user4", 01012341234, null, RoleType.USER, null, null);

    }

    @Test
    public void basicTest() {
        memberRepository.findAll();
    }
}