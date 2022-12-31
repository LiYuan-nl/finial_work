package com.example.finial_work.Controller;

import com.example.finial_work.service.IBookService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@MapperScan("com/example/finial_work/mapper")
@RequestMapping("/delete")
public class Delete_Controller {
    @Autowired
    IBookService bookService;

    @GetMapping
    String delete(@RequestParam int id) {
        bookService.removeById(id);
        return "redirect:/list";
    }
}
