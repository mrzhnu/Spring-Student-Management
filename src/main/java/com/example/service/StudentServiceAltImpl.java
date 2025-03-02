package com.example.service;

import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceAltImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceAltImpl(@Qualifier("studentRepository") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(int id, String name) {
        studentRepository.addStudent(id, name);
        System.out.println("Added (Alt Service): " + name);
    }

    @Override
    public String getStudent(int id) {
        return studentRepository.getStudent(id);
    }
}
