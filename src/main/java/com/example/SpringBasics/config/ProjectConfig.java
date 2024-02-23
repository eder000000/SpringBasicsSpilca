package com.example.SpringBasics.config;

import com.example.SpringBasics.objects.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Cotorro");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Perico");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Verde");
        return p;
    }

}
