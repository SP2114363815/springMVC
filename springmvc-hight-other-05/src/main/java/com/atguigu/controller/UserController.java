package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("data")
    public String data(){
        String name=null;
        name.toString();//空指针
        return "ok";
        //空指针异常
    }
    @GetMapping("data1")
    public String data1(){
        //算数异常
        int i=1/0;
        return "ok";
    }
}
