package com.example.java.domains.student;
import java.util.List;
import java.util.ArrayList;

public class StudentGroup {
    private List<Student> students;

    public StudentGroup() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents(){
        return students;
    }
}
