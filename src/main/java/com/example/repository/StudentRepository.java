package com.example.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    private final Map<Integer, String> students = new HashMap<>();

    public void addStudent(int id, String name) {
        students.put(id, name);
    }

    public String getStudent(int id) {
        return students.getOrDefault(id, "Not Found");
    }
}
