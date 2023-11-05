package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping
    public List<User> page(@RequestParam(required = false,defaultValue = "1")
                               int page,@RequestParam(required = false,defaultValue = "10") int size){
      return null;
    }
    @PostMapping
    public User save(@RequestBody User user){
        return user;
    }
    @GetMapping("{id}")
    public User detail(@PathVariable Integer id){
        return null;
    }
    @PutMapping
    public User update(@RequestBody User user){
        return user;
    }
    @DeleteMapping("{id}")
    public User delete(@PathVariable Integer id){
        return null;
    }
    @GetMapping("search")
    public List<User> search(String keywork,
                             @RequestParam(required = false,defaultValue = "1") int page,
                             @RequestParam(required = false,defaultValue = "10")int size){
        return null;
    }
}
