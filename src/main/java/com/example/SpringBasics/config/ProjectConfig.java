package com.example.SpringBasics.config;

import com.example.SpringBasics.objects.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Cotorro");
        return p;
    }

}
