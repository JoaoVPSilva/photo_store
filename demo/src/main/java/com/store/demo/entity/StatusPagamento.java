package com.store.demo.entity;

import jakarta.persistence.Entity;

@Entity
public enum StatusPagamento {
    PENDENTE,
    APROVADO,
    RECUSADO
}
