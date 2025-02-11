package com.example.java.view;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public String readLine() {
        String value = sc.nextLine();
        if (value.isBlank()) {
            throw new IllegalArgumentException("공백은 입력할 수 없습니다.");
        }
        return value;
    }

    public int menuInt() {
        try {
            int value = sc.nextInt();
            sc.nextLine();
            return value;
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }

    public int scoreInt() {
        int value = sc.nextInt();
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException("점수 값의 범위는 0~100 입니다.");
        }
        return value;
    }
}
