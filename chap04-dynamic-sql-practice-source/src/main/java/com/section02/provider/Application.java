package com.section02.provider;

import com.section01.xml.MenuService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int selectNo;
        do {
            System.out.println("========== 구문 builder API 활용 Dynamic SQL ==========");
            System.out.println("1. SelectBuilder Test");
            System.out.println("2. SqlBuilder Test");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("번호를 입력해주세요: ");
            int selectNo = sc.nextInt();

            switch (selectNo) {
                case 1:
                    break;
                case 2:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
        while (true) ;
    }
}
