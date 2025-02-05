package com.example.java.domains.student;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Students {
    private List<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents(){
        return students;
    }

    public void stdRegister(List<Student> students, Student student) {
        students.add(student);
    }

    public Student findDeletedStudentById(List<Student> students, String deleteId){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getSid().equals(deleteId)){
                return student;
            }
        }
        return null;
    }

    public String stdDelete(Student student) {
        String name = student.getName();
        students.remove(student);
        return name;
    }
}
