package com.store.demo.entity;

import jakarta.persistence.*;

@Entity
public class Endereco {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = true)
    private String numero;

    @Column(nullable = true)
    private String referencia;

}
