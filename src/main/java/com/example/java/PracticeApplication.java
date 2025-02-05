package com.example.java;

import com.example.java.domains.function.Validator;
import com.example.java.domains.student.Students;
import com.example.java.domains.student.Student;
import com.example.java.view.InputView;
import com.example.java.view.OutputView;

public class PracticeApplication {
    public static void main(String[] args) {
        Students students = new Students();
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        Validator validator = new Validator();
        try {
            while (true) {
                outputView.mainMenu();
                switch (inputView.menuInt()) {
                    case 3: // 등록
                        outputView.showStudentIdPrompt();
                        String id = inputView.readLine();
                        validator.validateSid(id);
                        validator.validateRegistration(students.getStudents(), id);

                        outputView.showStudentNamePrompt();
                        String name = inputView.readLine();
                        validator.validateName(name);

                        outputView.showStudentKoreanScorePrompt();
                        int korScore = inputView.scoreInt();

                        outputView.showStudentMathScorePrompt();
                        int mathScore = inputView.scoreInt();

                        outputView.showStudentEnglishScorePrompt();
                        int engScore = inputView.scoreInt();

                        Student student = new Student(id, name, korScore, mathScore, engScore);
                        student.stdRegister(students.getStudents(), student);
                        outputView.showRegistrationSuccessMessage();
                        break;
                    case 5: // 삭제
                        outputView.showDeleteStudentIdPrompt();
                        String deleteId = inputView.readLine();
                        validator.validateSid(deleteId);
                        validator.validateDeletion(students.getStudents(), deleteId);
                        String deletedName = Student.stdDelete(students.getStudents(), deleteId);
                        outputView.showDeletionSuccessMessage(deletedName);
                }
                ;
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
