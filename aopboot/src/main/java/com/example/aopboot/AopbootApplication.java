package com.example.aopboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopbootApplication implements CommandLineRunner {

    @Autowired
    Iexample example;

    public static void main(String[] args) {
        SpringApplication.run(AopbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        example.doSomeThing();

    }
}
