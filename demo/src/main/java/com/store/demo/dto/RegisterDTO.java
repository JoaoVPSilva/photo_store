package com.store.demo.dto;

import com.store.demo.enums.UserRole;

public record RegisterDTO(String email, String nome, String psw, String tel, UserRole role) {

    @Override
    public final String toString() {
        return email() + " " + nome() + " " + psw() + " " + tel() + " " + role();
    }
}
