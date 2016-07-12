package com.lisk.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2016/7/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }

}
