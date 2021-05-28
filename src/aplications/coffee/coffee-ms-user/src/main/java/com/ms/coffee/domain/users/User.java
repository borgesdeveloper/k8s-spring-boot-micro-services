package com.ms.coffee.domain.users;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "users")
public class User {
    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
