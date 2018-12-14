package com.Tomcat.controller;

import com.Tomcat.pojo.User;
import com.Tomcat.service.IProService;
import com.Tomcat.service.ProServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
    private IProService service = new ProServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username= req.getParameter("us");
        User user = service.selOneUser(username);
       if(user==null){
            resp.getWriter().write("1");  //可以
       }else {
            resp.getWriter().write("0");  //存在
       }
    }
}
