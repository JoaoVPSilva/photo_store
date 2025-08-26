package com.store.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = true)
    private String infoAdicional;

    @Column(nullable = false)
    private String tipo; //ver de criar os tipos no enum se pa

    @Column(nullable = true) // ver se vai ser false mesmo
    private Integer quantidadeEstoque;

    @Column(nullable = false)
    private Integer quantidadeAvaliacoes;

    @Column(nullable = false)
    private Boolean produtoAtivo;

    @Column
    private Boolean vigencia;

}
