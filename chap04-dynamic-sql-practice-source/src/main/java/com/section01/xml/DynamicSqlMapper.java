package com.section01.xml;

import com.common.MenuDTO;
import com.common.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {
    List<MenuDTO> selectMenuByPrice(Map<String, Integer> map);

    List<MenuDTO> searchMenuBySubCategory(SearchCriteria searchCriteria);
}
