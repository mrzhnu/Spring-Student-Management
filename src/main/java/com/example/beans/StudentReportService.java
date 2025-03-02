package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class StudentReportService {
    public StudentReportService() {
        System.out.println("[Lazy] StudentReportService initialized");
    }
}
