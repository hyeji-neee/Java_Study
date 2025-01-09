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
}
