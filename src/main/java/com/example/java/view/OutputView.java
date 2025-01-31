package com.example.java.view;

import com.example.java.domains.student.*;

public class OutputView {

    public void mainMenu(){
        System.out.println("<학생 관리 프로그램>");
        System.out.println("1. 모든 학생 조회 (이름순)");
        System.out.println("2. 모든 학생 조회 (평균순)");
        System.out.println("3. 학생 등록");
        System.out.println("4. 학생 정보 수정");
        System.out.println("5. 학생 삭제");
        System.out.println("6. 학생 검색");
        System.out.println("7. 종료");
        System.out.println("메뉴를 선택하세요 : ");
    }

}
