package com.example.springSecuritytest.controllers;

import com.example.springSecuritytest.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController
{
    private final UserService userService;
}
