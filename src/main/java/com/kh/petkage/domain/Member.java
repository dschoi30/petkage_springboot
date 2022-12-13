package com.kh.petkage.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String memberName;

    private int phoneNumber;

    @Column(unique = true)
    private String email;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType roleType;

    @JsonIgnore
    @OneToOne(mappedBy = "member", fetch = FetchType.LAZY)
    private Cart cart;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    public Member(String password, String memberName, int phoneNumber, Address address, RoleType roleType, Cart cart, List<Order> orders) {
        this.password = password;
        this.memberName = memberName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.roleType = roleType;
        this.cart = cart;
        this.orders = orders;
    }
}
