package com.store.demo.entity;

import jakarta.persistence.*;

@Entity
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Cliente cliente;

    private Produto produto;

}
