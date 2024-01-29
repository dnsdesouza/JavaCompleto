package br.com.cod3r.exercicios_springBoot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class PrimeiroController {

    @RequestMapping
    public String ola() {

        return "Ola Spring Boot";
    }
}