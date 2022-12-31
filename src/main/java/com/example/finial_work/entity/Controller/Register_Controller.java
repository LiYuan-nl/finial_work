package com.example.finial_work.entity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Register_Controller {
    @RequestMapping("/register")
    public String register(){
        return "/register";
    }

    @RequestMapping(value = "/inregister", method = RequestMethod.POST)
    public String register(String username, String password) {
        //TODO:进行数据库注入
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "redirect:tologin";
    }
}
