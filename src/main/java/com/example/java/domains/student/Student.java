package com.example.java.domains.student;

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

    public String getName(){
        return name;
    }

    public double getAverageScore(){
        return (koreanScore + mathScore + englishScore)/3.0;
    }

    public void validate(String sid) {
        validateSid(sid);
    }

    private void validateSid(String sid) {
        if(sid.length() != 8) {
            throw new IllegalArgumentException("학번은 8자리이어야 합니다.");
        }
    }
}
