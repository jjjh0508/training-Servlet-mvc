package com.jihwan.mara.controller;

import com.jihwan.mara.model.dto.MenuAllDTO;
import com.jihwan.mara.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/menu/select")
public class SelectAllmenuServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MenuService service = new MenuService();
        List<MenuAllDTO> menuAllDTOS = service.selectAllMenu();
        for (MenuAllDTO menuAllDTO: menuAllDTOS) {
            System.out.println(menuAllDTO);
        }

        String path = "";
        if (menuAllDTOS != null) {
            path = "/WEB-INF/views/menu/menuList.jsp";
            req.setAttribute("menuList",menuAllDTOS);
        }else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message","전체 메뉴 조회 실패");
        }
        req.getRequestDispatcher(path).forward(req,resp);
    }
}
