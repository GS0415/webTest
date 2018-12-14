package com.Tomcat.controller;

import com.Tomcat.pojo.Product;
import com.Tomcat.service.IProService;
import com.Tomcat.service.ProServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private IProService service =new ProServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list=service.sel();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/Jsps/list.jsp").forward(req,resp);
    }
}
