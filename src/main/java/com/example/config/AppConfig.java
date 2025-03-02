package com.example.config;

import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
import com.example.service.StudentServiceAltImpl;
import com.example.repository.StudentRepository;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepository();
    }

    @Bean
    @Primary
    public StudentService studentServiceImpl(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public StudentService studentServiceAltImpl(StudentRepository studentRepository) {
        return new StudentServiceAltImpl(studentRepository);
    }
}
