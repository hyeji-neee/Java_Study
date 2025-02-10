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
                    case 3:
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
                        students.stdRegister(students.getStudents(), student);
                        outputView.showRegistrationSuccessMessage();
                        break;

                    case 5:
                        outputView.showDeleteStudentIdPrompt();
                        String deleteId = inputView.readLine();
                        validator.validateSid(deleteId);
                        Student deletedStudent = students.findStudentById(students.getStudents(), deleteId);
                        String deletedName = students.stdDelete(deletedStudent);
                        outputView.showDeletionSuccessMessage(deletedName);
                        break;

                    case 6:
                        outputView.showSearchStudentIdPrompt();
                        String searchId = inputView.readLine();
                        Student searchedStudent = students.findStudentById(students.getStudents(), searchId);
                        outputView.showSearchedStudentName(searchedStudent.getName());
                        outputView.showSearchedStudentAverageScore(searchedStudent.calculateAverageScore());
                        break;

                    case 7:
                        outputView.showProgramEndMessage();
                        return;

                    default:
                        System.out.println("1~7번 항목중 선택해야합니다.");
                }
                ;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
