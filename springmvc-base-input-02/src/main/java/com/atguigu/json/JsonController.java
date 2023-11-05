package com.atguigu.json;

import com.atguigu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {
    //data -请求体 post {name,age,gender}
    @PostMapping("data")
    public String data(@RequestBody Person person){
        System.out.println("person"+person);
        return person.toString();
    }
}
