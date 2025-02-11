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

    public void register(List<Student> students, Student student) {
        students.add(student);
    }

    public Student findById(List<Student> students, String id) {
        return students.stream()
                .filter(student -> student.getSid().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("학생을 찾을 수 없습니다."));
    }

    public String delete(Student student) {
        String name = student.getName();
        students.remove(student);
        return name;
    }

    public void sortByName(List<Student> students){
        students.sort(Comparator.comparing(Student::getName));
    }

    public void sortByScore(List<Student> students){
        students.sort(Comparator.comparing(Student::calculateAverageScore).reversed());
    }
}
