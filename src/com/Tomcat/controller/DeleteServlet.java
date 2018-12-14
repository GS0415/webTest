package com.Tomcat.controller;

import com.Tomcat.service.IProService;
import com.Tomcat.service.ProServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    IProService service =new ProServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id = Integer.parseInt(req.getParameter("productId"));
        service.del(id);
        resp.sendRedirect("list");
    }
}
