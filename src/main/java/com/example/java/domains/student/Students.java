package com.example.java.domains.student;
import java.util.List;
import java.util.ArrayList;

public class Students {
    private List<Student> stdList;

    public Students() {
        stdList = new ArrayList<>();
    }

    public List<Student> getStudentList(){
        return stdList;
    }
}
