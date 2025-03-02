package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class StudentDatabase {
    public StudentDatabase() {
        System.out.println("[Eager] StudentDatabase initialized");
    }
}
