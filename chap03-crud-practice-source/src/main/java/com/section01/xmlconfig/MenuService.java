package com.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.section01.xmlconfig.Template.getSqlSession;

public class MenuService {
    private final MenuDAO menuDAO;

    public List<MenuDTO> = selectAllMenu(){
        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        sqlSession.close();

        return menuList;

    }
}
