package com.example.java.domains.function;
import com.example.java.domains.student.Student;

import java.util.List;

public class Register {
    Student student;
    public Register(String id, String name, int korScore, int mathScore, int englishScore){
        student = new Student(id, name, korScore, mathScore, englishScore);
    }

    public void stdRegister(List<Student> students) {
        students.add(this.student);
        System.out.println("학생 등록이 완료되었습니다!");
    }
}
