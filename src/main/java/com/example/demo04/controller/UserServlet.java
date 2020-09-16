package com.example.demo04.controller;

import com.example.demo04.dao.UserMapper;
import com.example.demo04.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserServlet {
    @Autowired
    UserMapper userMapper;

    @GetMapping("get")
    public List<User> getUser(String username){
        System.out.println("------------------------------");
        System.out.println(username);
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");
        List<User> userList=userMapper.getUser();
        return userList;
    }
    @GetMapping("upd")
    public String upd(Model model){
        System.out.println("--------");
        User user=new User(11,"小黄",1);
        int num=userMapper.updateUser(user);
        return num+"更新";
    }
    @GetMapping("del")
    public String del(){
        return userMapper.deleteUser(12)+"删除";
    }
    @GetMapping("add")
    public String add(){
        User user=new User(null,"小紫",16);
        return userMapper.addUser(user)+"添加";
    }
}
