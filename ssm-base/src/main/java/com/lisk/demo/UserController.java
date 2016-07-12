package com.lisk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2016/7/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hello")
    public String hello(){
        User user=new User();
        user.setUsername("ha");
        userService.saveUser(user);
        return "hello";
    }

}
