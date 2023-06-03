package com.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    //전메뉴 출력(?)
    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }
    }

    //단일 메뉴 출력(?)
    public void printMenu(MenuDTO menu) {
        System.out.println(menu);
    }

    //성공 메세지 출력
    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규 메뉴 등록에 성공하셨습니다.";
                break;
            case "update" :
                successMessage = "메뉴 수정에 성공하셨습니다.";
                break;
            case "delete" :
                successMessage = "메뉴 삭제에 성공하셨습니다.";
                break;
        }
        System.out.println(successMessage);
    }

    //오류 메세지 출력
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" :
                errorMessage = "메뉴 목록 조회에 실패하셨습니다.";
                break;
            case "selectOne" :
                errorMessage = "메뉴 조회에 실패하셨습니다.";
                break;
            case "insert" :
                errorMessage ="신규 메뉴 등록에 실패하셨습니다.";
                break;
            case "update" :
                errorMessage ="메뉴 수정에 실패하셨습니다.";
                break;
            case "delete" :
                errorMessage ="메뉴 삭제에 실패하셨습니다.";
                break;
        }
        System.out.println(errorMessage);
    }

}
