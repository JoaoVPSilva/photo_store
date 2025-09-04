package com.store.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.store.demo.entity.User;

import io.micrometer.common.lang.NonNullApi;

@NonNullApi
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);

    UserDetails findByEmail(String email);

    boolean existsByEmail(String email);

    List<User> findAll();

    //Exemplo
//    @Query("SELECT mo FROM MeuObjeto mo WHERE mo.atributo = :valor")
//    List<MeuObjeto> findByAtributo(@Param("valor") String valor);
}
