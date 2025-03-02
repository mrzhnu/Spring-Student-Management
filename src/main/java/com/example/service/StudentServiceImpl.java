package com.example.service;

import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(int id, String name) {
        studentRepository.addStudent(id, name);
        System.out.println("Added (Primary Service): " + name);
    }

    @Override
    public String getStudent(int id) {
        return studentRepository.getStudent(id);
    }
}
