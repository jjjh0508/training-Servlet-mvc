package com.jihwan.mara.controller;

import com.jihwan.mara.model.dto.MenuInsertDTO;
import com.jihwan.mara.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu/insert")
public class MenuInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MenuInsertDTO menuInsertDTO = new MenuInsertDTO();
        menuInsertDTO.setMenuName(req.getParameter("menuName"));
        menuInsertDTO.setMenuPrice(req.getParameter("menuPrice"));
        menuInsertDTO.setCategory(req.getParameter("category"));
        MenuService menuService = new MenuService();
        int result = menuService.insertMenu(menuInsertDTO);

        String path = "";

        if (result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            req.setAttribute("successCode","메뉴추가 완료");
        }else {
            path="/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message","메뉴추가 실패");
        }

        req.getRequestDispatcher(path).forward(req,resp);

    }
}
