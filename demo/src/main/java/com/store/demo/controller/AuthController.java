package com.store.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.dto.AuthDTO;
import com.store.demo.dto.LoginResponseDTO;
import com.store.demo.dto.RegisterDTO;
import com.store.demo.entity.User;
import com.store.demo.enums.UserRole;
import com.store.demo.infra.security.TokenService;
import com.store.demo.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("auth")
@Tag(name = "Autenticação", description = "Controller responsável por autenticar usuários")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    @Operation(summary = "Login a partir de e-mail e senha", description = "Retorna token JWT de um usuário logado")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody AuthDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    @Operation(summary = "Registro de novos usuários", description = "Cadastra usuário no banco de dados")
    public ResponseEntity<?> register(@RequestBody RegisterDTO data) {

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.psw());

        User newUser = new User(data.email(), data.nome(), encryptedPassword, data.tel(), UserRole.USER);

        try {
            this.userService.save(newUser);
        } catch (DuplicateKeyException e) {
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().build();
    }
}
