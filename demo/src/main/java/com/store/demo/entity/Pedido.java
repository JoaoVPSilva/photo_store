package com.store.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Carrinho carrinho;

    @Column(nullable = false)
    private Date dataPedido;

    @Column(nullable = false)
    private String statusPedido;

    @Column(nullable = false)
    private BigDecimal valorTotal;
}
