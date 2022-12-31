package com.example.finial_work.Controller;

import com.example.finial_work.service.IBookService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@MapperScan("com/example/finial_work/mapper")
@RequestMapping("/show")
public class Show_Controller {
    @Autowired
    IBookService bookService;

    @GetMapping
    public  String index(Model model){
        //model.addAttribute("message", "Hello Spring MVC!");
        return "SHOW";
    }
}
