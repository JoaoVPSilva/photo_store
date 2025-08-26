package com.store.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Avaliacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long produtoId;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descComentario;

    @Column(nullable = false)
    private Integer qntEstrelas;

    @Column(nullable = false)
    private Date dataAvaliacao;
}
