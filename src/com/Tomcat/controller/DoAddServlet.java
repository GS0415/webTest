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
@WebServlet("/doAdd")
public class DoAddServlet extends HttpServlet {
    private IProService service = new ProServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =req.getParameter("name");
        Double price= Double.parseDouble(req.getParameter("price"));
        String url =req.getParameter("url");
        String des =req.getParameter("des");
        Product pro=new Product();
        pro.setProductPrice(price);
        pro.setProductDes(des);
        pro.setProductName(name);
        pro.setProductUrl(url);
        service.add(pro);
        resp.sendRedirect("list");
    }
}
