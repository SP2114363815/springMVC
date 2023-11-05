package com.atguigu;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.WebApplicationInitializer;

public class Main implements WebApplicationInitializer {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //每当web项目启动。就会自动调用该接口的onStartup
        System.out.println("Main.onStartup");
        //ioc容器的初始化
        //dispatcherServlet
    }
}