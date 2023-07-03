package com.jihwan.mara.controller;

import com.jihwan.mara.model.dto.MenuOneDTO;
import com.jihwan.mara.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu/selectone")
public class SelectOneMenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String menuCode = req.getParameter("menuCode");

        MenuService menuService = new MenuService();

        MenuOneDTO menuOneDTO = menuService.selectOneMene(menuCode);

        System.out.println(menuOneDTO);
        String path = "";
        if (menuOneDTO != null) {
            path = "/WEB-INF/views/menu/showMenuInfo.jsp";
            req.setAttribute("selectOne",menuOneDTO);

        }else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message","메뉴 조회 실패");
        }
        req.getRequestDispatcher(path).forward(req, resp);
    }
}
