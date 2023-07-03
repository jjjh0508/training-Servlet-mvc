package com.jihwan.mara.controller;

import com.jihwan.mara.model.dto.UpdateMenuDTO;
import com.jihwan.mara.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu/updete")
public class MenuUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String menuCode=req.getParameter("menuCode");
        String status=req.getParameter("status");
        String price=req.getParameter("price");


        System.out.println(menuCode);
        System.out.println(status);
        System.out.println(price);
        UpdateMenuDTO updateMenuDTO = new UpdateMenuDTO();

        updateMenuDTO.setMenuCode(menuCode);
        updateMenuDTO.setStatus(status);
        updateMenuDTO.setPrice(price);

        int result = new MenuService().updateMenu(updateMenuDTO);

        String path  = "";
        if (result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            req.setAttribute("successCode","메뉴수정 완료");
        }else {
            path="/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message","메뉴수정 실패");
        }
        req.getRequestDispatcher(path).forward(req,resp);

    }
}
