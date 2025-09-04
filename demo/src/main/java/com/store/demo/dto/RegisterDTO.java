package com.store.demo.dto;

import com.store.demo.enums.UserRole;

public record RegisterDTO(String email, String nome, String psw, String tel, UserRole role) {
}
