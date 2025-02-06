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

                    case 4:
                        outputView.showModifyStudentIdPrompt();
                        String modifyId = inputView.readLine();
                        Student modifiedStudent = students.findStudentById(students.getStudents(), modifyId);
                        outputView.modifyMenu();
                        switch (inputView.menuInt()) {
                            case 1:
                                outputView.showModifyIdPrompt();
                                String modifiedId = inputView.readLine();
                                students.stdModifyId(modifiedStudent, modifiedId);
                                break;
                            case 2:
                                outputView.showModifyNamePrompt();
                                String modifiedName = inputView.readLine();
                                students.stdModifyName(modifiedStudent, modifiedName);
                                break;
                            case 3:
                                outputView.showModifyKoreanScorePrompt();
                                int modifiedKorScore = inputView.scoreInt();
                                students.stdModifyKoreanScore(modifiedStudent, modifiedKorScore);
                                break;
                            case 4:
                                outputView.showModifyMathScorePrompt();
                                int modifiedMathScore = inputView.scoreInt();
                                students.stdModifyMathScore(modifiedStudent, modifiedMathScore);
                                break;
                            case 5:
                                outputView.showModifyEnglishScorePrompt();
                                int modifiedEngScore = inputView.scoreInt();
                                students.stdModifyEnglishScore(modifiedStudent, modifiedEngScore);
                                break;
                        }
                        outputView.showModificationSuccessMessage();
                        break;

                    case 5:
                        outputView.showDeleteStudentIdPrompt();
                        String deleteId = inputView.readLine();
                        validator.validateSid(deleteId);
                        Student deletedStudent = students.findStudentById(students.getStudents(), deleteId);
                        String deletedName = students.stdDelete(deletedStudent);
                        outputView.showDeletionSuccessMessage(deletedName);
                        break;
                }
                ;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
