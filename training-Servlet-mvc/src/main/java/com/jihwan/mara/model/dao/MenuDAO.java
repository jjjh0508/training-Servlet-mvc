package com.jihwan.mara.model.dao;

import com.jihwan.mara.common.config.ConfigLocation;
import com.jihwan.mara.model.dto.MenuAllDTO;
import com.jihwan.mara.model.dto.MenuInsertDTO;
import com.jihwan.mara.model.dto.MenuOneDTO;
import com.jihwan.mara.model.dto.UpdateMenuDTO;

import static com.jihwan.mara.common.jdbc.JDBCTemplate.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MenuDAO {
    private final Properties prop;

    public MenuDAO() {
        prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION + "menu-mapper.xml"));
            System.out.println(ConfigLocation.MAPPER_LOCATION + "menu-mapper.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<MenuAllDTO> selectAllMenu(Connection con) {
        Statement stmt = null;
        ResultSet rset = null;

        String query = prop.getProperty("selectMenuAll");
        List<MenuAllDTO> menuList = null;
        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            menuList = new ArrayList<>();
            while (rset.next()) {
                MenuAllDTO menuAllDTO = new MenuAllDTO();
                menuAllDTO.setMenuName(rset.getString("MENU_NAME"));
                menuAllDTO.setMenuPrice(rset.getInt("MENU_PRICE"));

                menuList.add(menuAllDTO);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return menuList;
    }


    public MenuOneDTO selectOneMenu(Connection con, String menuCode) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        MenuOneDTO menuOneDTO = null;

        String query = prop.getProperty("selectOneMenu");

        System.out.println(query);
        int menuCodeint = Integer.parseInt(menuCode);

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, menuCodeint);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                menuOneDTO = new MenuOneDTO();
                menuOneDTO.setMenuName(rset.getString("MENU_NAME"));
                menuOneDTO.setPrice(Integer.parseInt(rset.getString("MENU_PRICE")));
                menuOneDTO.setCategory(rset.getString("CATEGORY_CODE"));
                menuOneDTO.setCategoryName(rset.getString("CATEGORY_NAME"));
                menuOneDTO.setOrderableSataus(rset.getString("ORDERABLE_STATUS"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }
        return menuOneDTO;

    }

    public int updateMenu(Connection con, UpdateMenuDTO updateMenuDTO) {
        PreparedStatement pstmt = null;

        String query = prop.getProperty("updateMenu");
        int result = 0;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(updateMenuDTO.getPrice()));
            pstmt.setString(2, updateMenuDTO.getStatus());
            pstmt.setInt(3, Integer.parseInt(updateMenuDTO.getMenuCode()));
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int deleteMenu(Connection con, String menuCode) {
        PreparedStatement pstmt = null;

        String qurey = prop.getProperty("deleteMenu");
        int result = 0;

        try {
            pstmt = con.prepareStatement(qurey);
            pstmt.setInt(1, Integer.parseInt(menuCode));
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
        }

        return result;
    }

    public int insertMenu(Connection con, MenuInsertDTO menuInsertDTO) {
        PreparedStatement pstmt = null;
        String query = prop.getProperty("insertMenu");
        int result=0;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1,menuInsertDTO.getMenuName());
            pstmt.setInt(2,Integer.parseInt(menuInsertDTO.getMenuPrice()));
            pstmt.setInt(3,Integer.parseInt(menuInsertDTO.getCategory()));
            result= pstmt.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            close(pstmt);
        }
        return result;
    }
}
