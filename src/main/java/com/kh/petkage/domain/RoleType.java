package com.kh.petkage.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleType {
    ADMIN("ROLE_ADMIN", "관리자"),
    SELLER("ROLE_SELLER", "판매자"),
    USER("ROLE_USER", "일반회원");

    private final String key;
    private final String title;
}
