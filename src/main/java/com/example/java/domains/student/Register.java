package com.example.java.domains.student;
import java.util.List;

public class Register {
    Student student;
    public Register(String id, String name, int korScore, int mathScore, int englishScore){
        student = new Student(id, name, korScore, mathScore, englishScore);
    }
}
