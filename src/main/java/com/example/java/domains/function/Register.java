package com.example.java.domains.function;
import com.example.java.domains.student.Student;

import java.util.List;

public class Register {
    public void stdRegister(List<Student> students, Student student) {
        students.add(student);
        System.out.println("학생 등록이 완료되었습니다!");
    }
}
