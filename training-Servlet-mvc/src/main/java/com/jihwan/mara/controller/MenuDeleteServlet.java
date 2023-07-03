package com.jihwan.mara.controller;

import com.jihwan.mara.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu/delete")
public class MenuDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String menuCode=req.getParameter("menuCode");
        int result = new MenuService().deleteMenu(menuCode);

        String path  = "";
        if (result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            req.setAttribute("successCode","메뉴삭제 완료");
        }else {
            path="/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message","메뉴삭제 실패");
        }
        req.getRequestDispatcher(path).forward(req,resp);
    }
}
