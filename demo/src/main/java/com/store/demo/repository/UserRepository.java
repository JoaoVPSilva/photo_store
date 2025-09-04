package com.store.demo.repository;

import com.store.demo.entity.User;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@NonNullApi
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);

    boolean existsByEmail(String email);

    List<User> findAll();

    //Exemplo
//    @Query("SELECT mo FROM MeuObjeto mo WHERE mo.atributo = :valor")
//    List<MeuObjeto> findByAtributo(@Param("valor") String valor);
}