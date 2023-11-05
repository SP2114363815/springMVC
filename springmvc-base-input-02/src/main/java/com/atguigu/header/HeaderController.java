package com.atguigu.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//获取请求头
@Controller
@RequestMapping("header")
@ResponseBody
public class HeaderController {
    @RequestMapping("data")
    public String data(@RequestHeader("Host") String host){
        System.out.println("Host="+host);
        return "Host="+host;
    }
}
