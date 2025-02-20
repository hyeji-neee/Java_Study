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

    @Override
    public String toString() {
        return sid + '\t' + name + '\t' + calculateAverageScore();
    }

    public void updateId(String newId) {
        this.sid = newId;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateKoreanScore(int newKoreanScore) {
        this.koreanScore = newKoreanScore;
    }

    public void updateMathScore(int newMathScore) {
        this.mathScore = newMathScore;
    }

    public void updateEnglishScore(int newEnglishScore) {
        this.englishScore = newEnglishScore;
    }
}
