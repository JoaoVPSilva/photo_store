package com.store.demo.service;

import com.store.demo.entity.User;
import com.store.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepo;

    public Optional<User> getUserById(Long id){
        return userRepo.findById(id);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
