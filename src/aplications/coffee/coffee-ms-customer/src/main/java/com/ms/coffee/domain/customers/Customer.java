package com.ms.coffee.domain.customers;

import com.ms.coffee.domain.customers.types.CustomerType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "customer")
public class Customer {
    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "tax_id")
    private String tax_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "type_id")
    private String type_id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "type_id", nullable = false, updatable = false, insertable = false)
    private CustomerType type;
}
