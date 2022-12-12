package com.kh.petkage.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseTimeEntity {

    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
