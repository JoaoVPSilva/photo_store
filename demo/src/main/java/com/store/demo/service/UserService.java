package com.store.demo.service;

import com.store.demo.entity.User;
import com.store.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public Optional<User> getUserById(Long id){
        return userRepo.findById(id);
    }

    public UserDetails getUserByEmail(String email){
        return userRepo.findByEmail(email);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public void save(User user) {
        if (getUserByEmail(user.getEmail()) != null) {
            throw new DuplicateKeyException("Usuário com esse e-mail já existe");
        }

        userRepo.save(user);
    }
}
