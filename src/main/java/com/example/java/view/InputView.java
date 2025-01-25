package com.example.java.view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);
    public String readLine() {
        String value = sc.nextLine();
        if(value.isBlank()) {
            throw new IllegalArgumentException("공백은 입력할 수 없습니다.");
        }
        return value;
    }

    public int menuInt(){
        int value = sc.nextInt();
        if(value < 1 || value > 7) {
            throw new IllegalArgumentException("1번~7번 항목 중 선택해야합니다.");
        }
        return value;
    }

    public int scoreInt(){
        int value = sc.nextInt();
        if(value < 0 || value > 100) {
            throw new IllegalArgumentException("점수 값의 범위는 0~100 입니다.");
        }
        return value;
    }
}
