package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller//配置注解
@ComponentScan("com.atguigu")//扫描包
@EnableWebMvc//handlerMapping handlerAdapter  json转换器
public class MvcConfig implements WebMvcConfigurer {
    //视图解析器，指定前后缀

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //registry可以快速添加前后缀
        registry.jsp("/WEB-INF/views/",".jsp");
    }
    //开启静态资源查找-》handlerMapping找有没有对应的handler---没有再找静态资源
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
    }
}
