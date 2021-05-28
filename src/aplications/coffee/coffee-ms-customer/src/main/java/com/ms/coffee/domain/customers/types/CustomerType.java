package com.ms.coffee.domain.customers.types;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "customer_types")
public class CustomerType {
    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "name")
    private String name;
}
