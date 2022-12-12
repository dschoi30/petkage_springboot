package com.kh.petkage.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
public class Address {

    private String zipCode;
    private String address;
    private String subAddress;

    public Address(String zipCode, String address, String subAddress) {
        this.zipCode = zipCode;
        this.address = address;
        this.subAddress = subAddress;
    }
}
