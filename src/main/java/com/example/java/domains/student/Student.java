package com.example.java.domains.student;

import java.util.List;
import java.util.Iterator;

public class Student {
    private String sid;
    private String name;
    private int koreanScore;
    private int mathScore;
    private int englishScore;

    public Student(String sid, String name, int koreanScore, int mathScore, int englishScore) {
        this.sid = sid;
        this.name = name;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public double calculateAverageScore() {
        return Math.round((koreanScore + mathScore + englishScore) / 3.0);
    }

    public void stdRegister(List<Student> students, Student student) {
        students.add(student);
    }

    public static String stdDelete(List<Student> students, String deleteId) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getSid().equals(deleteId)) {
                String name = student.getName();
                iterator.remove();
                return name;
            }
        }
        return null;
    }
}
