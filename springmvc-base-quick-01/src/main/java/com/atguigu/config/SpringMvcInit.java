package com.atguigu.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //service mapper 层的ioc容器的配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    //设置项目对应的配置类,ioc配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    //配置springmvc内部自带servlet的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
