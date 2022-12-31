package com.example.finial_work.Controller;

import com.example.finial_work.entity.Book;
import com.example.finial_work.service.IBookService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/list")
@MapperScan("com/example/finial_work/mapper")
public class List_Controller {
    @Autowired
    IBookService bookService;

    @GetMapping
    String list(Model model) {
        List<Book> books = bookService.list();
        model.addAttribute("books", books);
        return "LIST";
    }
}
