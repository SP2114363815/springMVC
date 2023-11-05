package com.atguigu.json;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
//返回json数据
@Controller
@RequestMapping("json")
public class JsonController {
    @GetMapping("data")
    @ResponseBody
    public User data(){
        User user = new User();
        user.setName("tpw");
        user.setAge(19);
        return user;//user->handlerAdapter->json》@ResponseBody->json直接返回
    }
    @ResponseBody
    @GetMapping("data1")
    public List<User> data1(){
        User user = new User();
        user.setName("tow");
        user.setAge(19);
        List<User> userList=new ArrayList<>();
        userList.add(user);
        return userList;
    }
}
