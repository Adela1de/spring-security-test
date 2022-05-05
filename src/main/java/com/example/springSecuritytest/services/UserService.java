package com.example.springSecuritytest.services;

import com.example.springSecuritytest.model.entities.User;
import com.example.springSecuritytest.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

}
