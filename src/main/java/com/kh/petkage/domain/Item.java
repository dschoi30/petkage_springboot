package com.kh.petkage.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Item extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @Builder
    public Item(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}
