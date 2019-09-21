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

/**
<!-- 注意idea默认没有web.xml的声明头,需要自己添加 -->
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
    http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
    version="3.0">
 */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
