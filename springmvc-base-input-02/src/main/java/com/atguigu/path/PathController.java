package com.atguigu.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {


    //  path/账号/密码
    //动态路径设计 {key}=*
    //接收路径参数
    @RequestMapping("{account}/{password}")
    public String login(@PathVariable(value = "account") String username,@PathVariable String password){
        System.out.println("username="+username+",password="+password);
        return "username="+username+",password="+password;
    }

}
