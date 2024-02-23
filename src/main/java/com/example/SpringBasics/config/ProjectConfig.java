package com.example.SpringBasics.config;

import com.example.SpringBasics.objects.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.SpringBasics.objects")
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Cotorro");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2() {
        var p = new Parrot();
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Verde");
        return p;
    }

}
