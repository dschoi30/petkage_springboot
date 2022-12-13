package com.kh.petkage.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@Commit
class EntityTest {

    @Autowired
    EntityManager em;

    @Test
    public void MemberTest() {

        Address address = new Address("12345", "서울시", "oo아파트");

        Member member1 = new Member("1234", "admin", 01012341234, address, RoleType.ADMIN, null, null);
        Member member2 = new Member("1234", "user1", 01012341234, address, RoleType.USER, null, null);
        em.persist(member1);
        em.persist(member2);

        em.flush();
        em.clear();

        List<Member> members = em.createQuery("select m from Member m", Member.class)
                .getResultList();

        for (Member member : members) {
            System.out.println("member = " + member);
            System.out.println("member.getAddress() = " + member.getAddress());
        }
    }

    @Test
    public void OrderEntityTest() {
        Member member1 = new Member("1234", "user2", 01012341234, null, RoleType.USER, null, null);
        Item item1 = new Item("item1", 10000, 100);
        Item item2 = new Item("item2", 5000, 50);
        OrderItem orderItem1 = new OrderItem(item1, 20000, 2);
        OrderItem orderItem2 = new OrderItem(item2, 20000, 4);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem1);
        orderItems.add(orderItem2);
        Order order1 = new Order(member1, orderItems, null, LocalDateTime.now(), OrderStatus.ORDERED);

        em.persist(member1);
        em.persist(item1);
        em.persist(item2);
        em.persist(orderItem1);
        em.persist(orderItem2);
        em.persist(order1);

        em.flush();
        em.clear();
        em.createQuery("select o from Order o", Order.class).getSingleResult();
    }
}