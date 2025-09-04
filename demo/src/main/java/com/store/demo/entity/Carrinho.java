package com.store.demo.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User cliente;

    @OneToMany
    private List<ItensCarrinho> itensCarrinho;
}
