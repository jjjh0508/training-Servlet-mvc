package com.jihwan.mara.model.service;

import com.jihwan.mara.model.dao.MenuDAO;
import com.jihwan.mara.model.dto.MenuAllDTO;
import com.jihwan.mara.model.dto.MenuOneDTO;
import com.jihwan.mara.model.dto.UpdateMenuDTO;

import static com.jihwan.mara.common.jdbc.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

public class MenuService {

    private final MenuDAO menuDAO;

    public MenuService() {
        menuDAO = new MenuDAO();
    }

    public List<MenuAllDTO> selectAllMenu() {
        Connection con = getConnection();
        List<MenuAllDTO> menuList = menuDAO.selectAllMenu(con);

        close(con);
        return  menuList;
    }


    public MenuOneDTO selectOneMene(String menuCode) {
        Connection con = getConnection();
        MenuOneDTO menuOneDTO = menuDAO.selectOneMenu(con,menuCode);

        close(con);
        return menuOneDTO;
    }

    public int updateMenu(UpdateMenuDTO updateMenuDTO) {
        Connection con = getConnection();
        int result = menuDAO.updateMenu(con,updateMenuDTO);
        if (result > 0) {
            commit(con);
        }else {
            rollback(con);

        }
        close(con);
        return result;
    }

    public int deleteMenu(String menuCode) {
        Connection con = getConnection();
        int result = menuDAO.deleteMenu(con,menuCode);
        if (result > 0) {
            commit(con);
        }else {
            rollback(con);

        }
        close(con);
        return result;
    }
}
