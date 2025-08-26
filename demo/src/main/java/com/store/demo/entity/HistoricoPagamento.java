package com.store.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class HistoricoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long idPedido;

    @Column(nullable = false)
    private Long idCliente;

    @Column(nullable = false)
    private String formaPagamento;

    @Column(nullable = false)
    private String StatusPedido;

    @Column(nullable = false)
    private String codTransacao;

    @Column(nullable = true)
    private BigDecimal valorParcelas;

    @Column(nullable = true)
    private Integer qntParcelas;

    @Column(nullable = true) // tem que ver isso ai
    private Date dataPagamento;
}
