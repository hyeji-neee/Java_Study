package com.example.java.domains.student;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Students {
    private List<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void stdRegister(List<Student> students, Student student) {
        students.add(student);
    }

    public Student findStudentById(List<Student> students, String id) {
        return students.stream()
                .filter(student -> student.getSid().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("학생을 찾을 수 없습니다."));
    }

    public String stdDelete(Student student) {
        String name = student.getName();
        students.remove(student);
        return name;
    }

    public void orderStudentsByName(List<Student> students){
        students.sort(Comparator.comparing(Student::getName));
    }
}
