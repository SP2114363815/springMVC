package com.atguigu.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//全局异常发生，会走此类写的handler
@ControllerAdvice//可以返回逻辑视图，转发和重定向
@RestControllerAdvice//
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public Object ArithmeticExceptionHandler(ArithmeticException e){
        //自定义处理异常即可 handler
        String message = e.getMessage();
        System.out.println("message:"+message);
        return message;
    }
    @ExceptionHandler(Exception.class)
    public Object ExceptionHandler(ArithmeticException e){
        //自定义处理异常即可 handler
        String message = e.getMessage();
        System.out.println("message:"+message);
        return message;
    }



}
