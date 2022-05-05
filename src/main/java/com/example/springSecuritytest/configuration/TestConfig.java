package com.example.springSecuritytest.configuration;

import com.example.springSecuritytest.database.Initiation;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@RequiredArgsConstructor
@Profile("test")
public class TestConfig {

    private final Initiation init;

    @Bean
    private void initDB()
    {
        init.initDB();
    }
}
