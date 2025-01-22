package com.example.java.domains.student;
import java.util.List;
import java.util.ArrayList;

public class StudentList {
    List<Student> stdList = new ArrayList<>();

    public void addStudent(Student student){
        stdList.add(student);
    }

}
