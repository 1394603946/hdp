package com.ssc.chl;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name="AddUser",urlPatterns = {"/adduser"})
public class AddUser1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        req.setCharacterEncoding("utf-8");
        System.out.println("========================");
        String  username = req.getParameter("username");
        String  userage = req.getParameter("userage");
        System.out.println(username+"     ========username================");
        System.out.println(userage+"     ========userage================");
        System.out.println("---end------");
        System.out.println("--test--");
    }
}
