package com.example.java.domains.function;

import com.example.java.domains.student.Student;

import java.util.List;

public class Validation {
    public void validateSid(String sid) {
        if (!sid.matches("\\d{8}")) {
            throw new IllegalArgumentException("학번은 8자리 숫자로만 이루어져야 합니다.");
        }
    }

    public void validateName(String name) {
        if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("이름에는 숫자가 올 수 없습니다.");
        }
    }

    public void validateRegistration(List<Student> students, String sid) {
        for (Student s : students) {
            if (s.getSid().equals(sid)) {
                throw new IllegalArgumentException("이미 등록되어있는 학생입니다.");
            }
        }
    }
}
