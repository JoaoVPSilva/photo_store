package com.store.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class HistoricoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Pedido pedido;

    @Column(nullable = false) // isso aqui tem que ser enum?
    private String formaPagamento;

    @Column(nullable = false) // enum?
    private String StatusPedido;

    @Column(nullable = false)
    private String codTransacao;

    @Column(nullable = true)
    private BigDecimal valorParcelas;

    @Column(nullable = true)
    private Integer qntParcelas;

    @Column(nullable = true)
    private Date dataPagamento;
}
