package com.example.springSecuritytest.controllers;

import com.example.springSecuritytest.model.entities.User;
import com.example.springSecuritytest.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController
{
    private final UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> finAll()
    {
        var users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
}
