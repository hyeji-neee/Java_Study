package com.example.java;

public class PracticeApplication {
    public static void main(String[] args) {
        try {
            System.out.println("hello world");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
