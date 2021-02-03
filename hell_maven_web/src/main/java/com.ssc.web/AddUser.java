package com.ssc.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

/*@WebServlet(name="AddUser",)*/
@WebServlet(name="AddUser",urlPatterns ={"/addUser"})
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("============================");
        String userName = req.getParameter("userName");
        String userAge = req.getParameter("userAge");
        System.out.println(userAge+":      userAge");
        System.out.println(userName+":     userName");
    }
}
