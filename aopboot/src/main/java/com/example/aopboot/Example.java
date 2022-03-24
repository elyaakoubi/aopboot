package com.example.aopboot;

import org.springframework.stereotype.Service;

@Service
public class Example implements Iexample
{
    public void doSomeThing() {
        System.out.println("doing something");
    }
}
