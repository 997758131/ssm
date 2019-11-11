package com.javakc.ssm.controller;

import com.javakc.ssm.entity.UserEntity;
import com.javakc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("insert")
    public String insert(UserEntity entity){
        userService.insert(entity);
        return "success";
    }
    @RequestMapping("delete")
    public String delete(String id){
        userService.delete(id);
        return "success";
    }
    @RequestMapping("update")
    public String update(UserEntity entity){
        userService.insert(entity);
        return "success";
    }
    @RequestMapping("queryByCount")
    public String queryByCount(UserEntity entity){
        userService.insert(entity);
        return "success";
    }


}
