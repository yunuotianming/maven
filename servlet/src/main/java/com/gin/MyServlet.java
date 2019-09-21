package com.gin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gin
 * @date 2019/9/21 9:24
 */
public class MyServlet extends HttpServlet {

    /**
     * 访问路径 http://localhost:8080/servlet
     * 会直接到首页
     * http://localhost:8080/servlet/MyServlet
     * 可以看到hello.jsp
     *
     * 启动时注意tomcat版本 Starting Servlet Engine: Apache Tomcat/7.0.47
     * 1.8jdk至少需要tomcat7才能运行
     *
     * mvn需要使用命令: tomcat7:run(不能是tomcat:run会默认使用tomcat6)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/hello.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
