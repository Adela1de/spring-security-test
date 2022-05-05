package com.example.springSecuritytest.model.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

}
