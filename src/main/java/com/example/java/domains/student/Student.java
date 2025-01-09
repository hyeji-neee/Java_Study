package com.example.java.domains.student;

public class Student {
    private String sid;
    // 추가...

    public void validate(String sid) {
        validateSid(sid);
    }

    private void validateSid(String sid) {
        if(sid.length() != 8) {
            throw new IllegalArgumentException("학번은 8자리이어야 합니다.");
        }
    }
}
