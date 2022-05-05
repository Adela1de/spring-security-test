package com.example.springSecuritytest.database;

import com.example.springSecuritytest.model.entities.User;
import com.example.springSecuritytest.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public class Initiation {

    private final UserRepository userRepository;

    public void initDB()
    {
        var user1 = new User("Luiz", "Luiz@Luiz.com", "3104");
        var user2 = new User("Nathalia", "Nat@Nat.com", "3104");
        var user3 = new User("Joao", "Joao@Joao.com", "6666");

        userRepository.saveAll(Arrays.asList(user1, user2, user3));
    }
}
