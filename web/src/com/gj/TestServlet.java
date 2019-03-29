package com.gj;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/hello", loadOnStartup = 1)
public class TestServlet extends HttpServlet {
    public TestServlet() {
        System.out.println("servlet实例化完成");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("1初始化完成1");
    }

    @Override
    public void destroy() {
        System.out.println("2销毁！2");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("hello嘿嘿");
        resp.getWriter().print("hello哈哈");
    }
}
