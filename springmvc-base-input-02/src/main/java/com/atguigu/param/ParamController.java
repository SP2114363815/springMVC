package com.atguigu.param;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ParamController {
    //直接接收
    //  /param/data?name=root&age=18
    //形参列表，填写对应名称的参数即可！请求参数名=形参参数名
    //名称相同，可以不传递，不报错
    @RequestMapping("data")
    @GetMapping("data")
    @ResponseBody
    public String data(String name,int age){
        System.out.println("name="+name+",age="+age);
        return "name="+name+",age="+age;
    }

    //注解指定
    //指定任意的请求参数名，要求必须传递，要求不必须传递，给予默认值
    //   /param/data1?account=root&age=1
    //要求account必须传递 page可以不必须传递。如果不传递默认值是1
    @GetMapping("data1")
    @ResponseBody
    public String data1(@RequestParam(value="account") String username,
                        @RequestParam(required = false,defaultValue = "1") int page){
        System.out.println("uername="+username+",page="+page);
        return "uername="+username+",page="+page;

    }

    //特殊值
    //一名多值 key=1&key=2 直接使用集合接值即可
    //data2?hbs=吃&hbs=玩&hbc=学习
    @GetMapping("data2")
    @ResponseBody
    public String data2(@RequestParam List<String> hbs){
        System.out.println("hbs="+hbs);
        return "ok";
    }
    //使用实体对象接值 用户注册（用户的信息） 对应的实体类 》插入到数据库表中
    //data3?name=二狗子&age=18 准备一个对应属性和get/set方法的实体类即可
    @GetMapping("data3")
    @ResponseBody
    public String data3(User user){
        System.out.println("user"+user);
        return user.toString();
    }



}
