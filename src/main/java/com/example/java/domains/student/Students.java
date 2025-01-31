package com.example.java.domains.student;
import java.util.List;
import java.util.ArrayList;

public class Students {
    private List<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents(){
        return students;
    }
}
