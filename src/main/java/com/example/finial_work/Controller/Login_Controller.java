package com.example.finial_work.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login_Controller {
    @RequestMapping("/tologin")
    public String tologin(){
        return "/LOGIN";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, Model model, HttpSession session){
        //用户名密码正确，默认密码123456
        //TODO:加入数据库后用select比对登录
        if("admin".equals(username) && "123456".equals(password)){
            session.setAttribute("loginUser", username);
            System.out.println(username);
            return "redirect:show";
        }
        //密码错误
        else{
            model.addAttribute("msg", "用户名或密码错误");
            return tologin();
        }
    }
}
