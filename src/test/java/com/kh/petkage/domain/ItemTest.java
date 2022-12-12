package com.kh.petkage.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemTest {

    @Autowired
    EntityManager em;

    @Test
    public void EntityTest() {

        Member member1 = new Member();
        Delivery delivery = new Delivery(new Address("12345", "인천시", "유원아파트"), DeliveryStatus.READY);
        Order order1 = new Order();

        Item item1 = new Item("item1", 10000, 100);
        Item item2 = new Item("item2", 5000, 50);
        em.persist(item1);
        em.persist(item2);

        em.flush();
        em.clear();

    }
}