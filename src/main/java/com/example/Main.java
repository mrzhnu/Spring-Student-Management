package com.example;

import com.example.config.AppConfig;
import com.example.service.StudentService;
import com.example.beans.StudentReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Инициализация ленивого бина
        context.getBean(StudentReportService.class);

        // Получаем основной сервис (@Primary)
        StudentService primaryService = context.getBean(StudentService.class);
        primaryService.addStudent(1, "Aizere");
        primaryService.addStudent(2, "Bekzhan");
        System.out.println("Student 1: " + primaryService.getStudent(1));
        System.out.println("Student 2: " + primaryService.getStudent(2));

        // Получаем альтернативный сервис по имени
        StudentService altService = context.getBean("studentServiceAltImpl", StudentService.class);
        altService.addStudent(3, "Aizhan");
        altService.addStudent(4, "Serzhan");
        System.out.println("Student 3: " + altService.getStudent(3));
        System.out.println("Student 4: " + altService.getStudent(4));

        context.close();
    }
}
