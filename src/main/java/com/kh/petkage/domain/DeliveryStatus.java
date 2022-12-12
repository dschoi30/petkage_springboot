package com.kh.petkage.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DeliveryStatus {

    READY("READY", "배송준비중"),
    COMP("COMP", "배송완료");

    private final String key;
    private final String title;
}