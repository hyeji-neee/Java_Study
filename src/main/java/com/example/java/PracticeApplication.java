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
        while (true) {
            try {
                outputView.mainMenu();
                switch (inputView.menuInt()) {
                    case 1:
                        validator.validateStudentsEmpty(students.getStudents());
                        students.sortByName(students.getStudents());
                        outputView.showStudents(students.getStudents());
                        break;
                    case 2:
                        validator.validateStudentsEmpty(students.getStudents());
                        students.sortByScore(students.getStudents());
                        outputView.showStudents(students.getStudents());
                        break;
                    case 3:
                        String id;
                        while (true) {
                            outputView.showStudentIdPrompt();
                            try {
                                id = inputView.readLine();
                                validator.validateSid(id);
                                validator.validateRegistration(students.getStudents(), id);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        String name;
                        while (true) {
                            outputView.showStudentNamePrompt();
                            try {
                                name = inputView.readLine();
                                validator.validateName(name);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        int korScore;
                        while (true) {
                            outputView.showStudentKoreanScorePrompt();
                            try {
                                korScore = inputView.scoreInt();
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        int mathScore;
                        while (true) {
                            outputView.showStudentMathScorePrompt();
                            try {
                                mathScore = inputView.scoreInt();
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        int engScore;
                        while (true) {
                            outputView.showStudentEnglishScorePrompt();
                            try {
                                engScore = inputView.scoreInt();
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        Student student = new Student(id, name, korScore, mathScore, engScore);
                        students.register(students.getStudents(), student);
                        outputView.showRegistrationSuccessMessage();
                        break;
                    case 4:
                        String modifyId;
                        Student modifiedStudent;
                        while (true) {
                            outputView.showModifyStudentIdPrompt();
                            try {
                                modifyId = inputView.readLine();
                                validator.validateSid(modifyId);
                                modifiedStudent = students.findById(students.getStudents(), modifyId);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        outputView.modifyMenu();
                        switch (inputView.menuInt()) {
                            case 1:
                                String modifiedId;
                                while (true) {
                                    outputView.showModifyIdPrompt();
                                    try {
                                        modifiedId = inputView.readLine();
                                        validator.validateSid(modifiedId);
                                        break;
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("\n" + e.getMessage());
                                    }
                                }
                                modifiedStudent.updateId(modifiedId);
                                break;
                            case 2:
                                String modifiedName;
                                while (true) {
                                    outputView.showModifyNamePrompt();
                                    try {
                                        modifiedName = inputView.readLine();
                                        validator.validateName(modifiedName);
                                        break;
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("\n" + e.getMessage());
                                    }
                                }
                                modifiedStudent.updateName(modifiedName);
                                break;
                            case 3:
                                int modifiedKorScore;
                                while (true) {
                                    outputView.showModifyKoreanScorePrompt();
                                    try {
                                        modifiedKorScore = inputView.scoreInt();
                                        break;
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("\n" + e.getMessage());
                                    }
                                }
                                modifiedStudent.updateKoreanScore(modifiedKorScore);
                                break;
                            case 4:
                                int modifiedMathScore;
                                while (true) {
                                    outputView.showModifyMathScorePrompt();
                                    try {
                                        modifiedMathScore = inputView.scoreInt();
                                        break;
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("\n" + e.getMessage());
                                    }
                                }
                                modifiedStudent.updateMathScore(modifiedMathScore);
                                break;
                            case 5:
                                int modifiedEngScore;
                                while (true) {
                                    outputView.showModifyEnglishScorePrompt();
                                    try {
                                        modifiedEngScore = inputView.scoreInt();
                                        break;
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("\n" + e.getMessage());
                                    }
                                }
                                modifiedStudent.updateEnglishScore(modifiedEngScore);
                                break;
                            default:
                                System.out.println("\n1~5번 항목 중 선택해야 합니다.");
                        }
                        outputView.showModificationSuccessMessage();
                        break;
                    case 5:
                        String deleteId;
                        Student deletedStudent;
                        while (true) {
                            outputView.showDeleteStudentIdPrompt();
                            try {
                                deleteId = inputView.readLine();
                                validator.validateSid(deleteId);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        deletedStudent = students.findById(students.getStudents(), deleteId);
                        String deletedName = students.delete(deletedStudent);
                        outputView.showDeletionSuccessMessage(deletedName);
                        break;
                    case 6:
                        String searchId;
                        Student searchedStudent;
                        while (true) {
                            outputView.showSearchStudentIdPrompt();
                            try {
                                searchId = inputView.readLine();
                                validator.validateSid(searchId);
                                break;
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n" + e.getMessage());
                            }
                        }
                        searchedStudent = students.findById(students.getStudents(), searchId);
                        outputView.showSearchedStudentName(searchedStudent.getName());
                        outputView.showSearchedStudentAverageScore(searchedStudent.calculateAverageScore());
                        break;
                    case 7:
                        outputView.showProgramEndMessage();
                        return;
                    default:
                        System.out.println("\n1~7번 항목중 선택해야합니다.");
                }
            } catch(IllegalArgumentException e){
                System.out.println("\n" + e.getMessage());
            }
        }
    }
}
