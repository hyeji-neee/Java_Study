package com.example.java;

import com.example.java.domains.function.Validation;
import com.example.java.domains.student.Students;
import com.example.java.domains.student.Student;
import com.example.java.view.InputView;
import com.example.java.view.OutputView;

public class PracticeApplication {
    public static void main(String[] args) {
        Students students = new Students();
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        Validation validation = new Validation();
        try {
            while(true){
                outputView.mainMenu();
                switch(inputView.menuInt()){
                    case 2: // 등록
                        outputView.showStudentIdPrompt();
                        String id = inputView.readLine();
                        validation.validateSid(id);
                        validation.validateRegistration(students.getStudents(), id);
                        outputView.showStudentNamePrompt();
                        String name = inputView.readLine();
                        outputView.showStudentKoreanScorePrompt();
                        int korScore = inputView.scoreInt();
                        outputView.showStudentMathScorePrompt();
                        int mathScore = inputView.scoreInt();
                        outputView.showStudentEnglishScorePrompt();
                        int engScore = inputView.scoreInt();
                        Student student = new Student(id,name,korScore,mathScore,engScore);
                        student.stdRegister(students.getStudents(), student);
                        outputView.showRegistrationSuccessMessage();
                        break;
                };
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
