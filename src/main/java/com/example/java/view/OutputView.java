package com.example.java.view;

import com.example.java.domains.student.*;

public class OutputView {
    public void mainMenu() {
        System.out.println("<학생 관리 프로그램>");
        System.out.println("1. 모든 학생 조회 (이름순)");
        System.out.println("2. 모든 학생 조회 (평균순)");
        System.out.println("3. 학생 등록");
        System.out.println("4. 학생 정보 수정");
        System.out.println("5. 학생 삭제");
        System.out.println("6. 학생 검색");
        System.out.println("7. 종료");
        System.out.print("메뉴를 선택하세요 : ");
    }

    public void modifyMenu() {
        System.out.println("1. 학번, 2. 이름, 3. 국어 점수, 4. 수학 점수, 5. 영어 점수");
        System.out.print("수정할 항목을 선택하세요 : ");
    }

    public void showStudentIdPrompt() {
        System.out.print("학번 8자리를 입력하세요 : ");
    }

    public void showStudentNamePrompt() {
        System.out.print("학생의 이름을 입력하세요 : ");
    }

    public void showStudentKoreanScorePrompt() {
        System.out.print("국어 점수를 입력하세요 (0~100) : ");
    }

    public void showStudentMathScorePrompt() {
        System.out.print("수학 점수를 입력하세요 (0~100) : ");
    }

    public void showStudentEnglishScorePrompt() {
        System.out.print("영어 점수를 입력하세요 (0~100) : ");
    }

    public void showDeleteStudentIdPrompt() {
        System.out.print("\n삭제할 학생의 학번을 입력하세요 : ");
    }

    public void showSearchStudentIdPrompt() {
        System.out.print("\n검색할 학생의 학번을 입력하세요 : ");
    }

    public void showModifyStudentIdPrompt() {
        System.out.print("\n수정할 학생의 학번을 입력하세요 : ");
    }

    public void showRegistrationSuccessMessage() {
        System.out.println("\n학생 등록이 완료되었습니다!\n");
    }

    public void showDeletionSuccessMessage(String deletedName) {
        System.out.println("\n" + deletedName + " 님이 삭제되었습니다.\n");
    }

    public void showModifyIdPrompt(){
        System.out.print("\n수정할 학번을 입력하세요 : ");
    }

    public void showModifyNamePrompt(){
        System.out.print("\n수정할 이름을 입력하세요 : ");
    }

    public void showModifyKoreanScorePrompt(){
        System.out.print("\n수정할 국어 점수를 입력하세요 : ");
    }

    public void showModifyMathScorePrompt(){
        System.out.print("\n수정할 수학 점수를 입력하세요 : ");
    }

    public void showModifyEnglishScorePrompt(){
        System.out.print("\n수정할 영어 점수를 입력하세요 : ");
    }

    public void showModificationSuccessMessage() {
        System.out.println("\n학생 수정이 완료되었습니다!\n");
      
    public void showSearchedStudentName(String searchedName) {
        System.out.println("\n이름: " + searchedName);
    }

    public void showSearchedStudentAverageScore(double averageScore) {
        System.out.println("평균: " + averageScore+"\n");
    }

    public void showProgramEndMessage(){
        System.out.println("프로그램을 종료합니다.");
    }
}
