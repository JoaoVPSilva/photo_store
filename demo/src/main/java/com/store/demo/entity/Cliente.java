package com.store.demo.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String psw;

    @Column(nullable = false)
    private String tel;

    @Column(nullable = false)
    private String tokenAuth;

    @OneToMany
    private List<Endereco> endereco;
}
