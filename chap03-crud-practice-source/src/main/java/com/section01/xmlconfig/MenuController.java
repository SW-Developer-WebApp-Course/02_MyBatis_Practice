package com.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {
    /*
    * Controller는 화면에서 입력한 값을 전달받아 로직에 알맞도로고 가공하고
    * service의 비즈니스 로직을 호출한 뒤, 결과값을 반환받아 결과에 따른 화면을 출력하도록 함.
    */

    //Controller에서 공통 사용할 객체 선언
    private final PrintResult printResult;
    private final MenuService menuService;

    public MenuController(){
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    // 1. 전체 메뉴 조회하기
    public void selectAllMenu(){
        List<MenuDTO> menuList = menuService.selectAllMenu();

        if (menuList != null){
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
    // 2. 메뉴 코드로 메뉴 조회하기
    public void selectMenuByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MenuDTO menu = menuService.selectMenuByCode(code);

        if(menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    // 3. 신규 메뉴 등록하기
    public void registMenu(Map<String, String> parameter) {

        String name = parameter.get("name");

        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("category"));

        MenuDTO menu = new MenuDTO();
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);

        if(menuService.registMenu(menu)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    // 4. 기존 메뉴 수정하기
    public void modifyMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();

        menu.setCode(code);
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);

        if(menuService.modifyMenu(menu)) {
            //return값이 true 인 경우(수정 성공)
            printResult.printSuccessMessage("update");
        } else {
            //return값이 false인 경우(수정 실패)
            printResult.printErrorMessage("update");
        }

    }
    // 5. 메뉴 삭제하기
    public void deleteMenu(Map<String, String> parameter) {

        //삭제할 메뉴를 코드로 받음
        int code = Integer.parseInt(parameter.get("code"));

        if(menuService.deleteMenu(code)) {
            printResult.printSuccessMessage("delete");
        } else{
            printResult.printErrorMessage("delete");
        }
    }
}
