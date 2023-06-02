package com.section01.xml;

import com.common.SearchCriteria;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("========== MyBatis Dynamic SQL(조건문) ==========");
            System.out.println("1. If 확인하기");
            System.out.println("2. choose(when, otherwise) 확인하기");
            System.out.println("3. foreach 확인하기");
            System.out.println("4. trim(where, set)확인하가ㅣ");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("번호를 입력해주세요: ");
            int selectNo = sc.nextInt();

            switch (selectNo){
                case 1: ifSubMenu();
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 9:
                    System.out.println("프로그램을 종료합니다."); return;
            }
        } while(true);
    }

    private static void ifSubMenu() {
        Scanner sc = new Scanner(System.in);

        MenuService menuService = new MenuService();

        do {
            System.out.println("========== if sub menu ==========");
            System.out.println("1. 원하는 금액대에 적합한 추천 메뉴 목록 조회");
            System.out.println("2. 메뉴명 또는 카테고리명으로 검색하여 메뉴 목록 조회");
            System.out.println("9. 이전 메뉴로 이동");
            System.out.print("메뉴 번호를 입력해주세요: ");
            int selectNo = sc.nextInt();

            switch (selectNo) {
                case 1: menuService.selectMenuByPrice(inputPrice());
                    break;
                case 2:
                    break;
                case 9:
                    return;
            }
        } while (true);
    }

    private static int inputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("추천받고 싶은 메뉴의 최대 금액을 입력해 주세요: ");
        int price = sc.nextInt();

        return price;
    }

    private static void chooseSubMenu(){
        Scanner sc = new Scanner(System.in);
        MenuService menuService = new MenuService();
        do {
            System.out.println("========== choose sub menu ==========");
            System.out.println("1. 카테고리 상위 분류별 메뉴 조회(식사, 음료, 디저트)");
            System.out.println("9. 이전 메뉴로 이동");
            System.out.print("메뉴 번호를 입력해주세요: ");
            int selectNo = sc.nextInt();

            switch (selectNo) {
                case 1:
                    menuService.searchMenuBySubCategory(inputSubCategory());
                    break;
                case 9:
            }
        } while (true);
    }

    private static SearchCriteria inputSubCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("상위 분류를 입력해 주세요(식사, 음료, 디저트)");
        String value = sc.nextLine();

        return new SearchCriteria("category", value);
    }
}
