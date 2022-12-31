package com.example.finial_work.Controller;

import com.example.finial_work.entity.Book;
import com.example.finial_work.service.IBookService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import java.awt.print.Book;

@Controller
@MapperScan("com/example/finial_work/mapper")
@RequestMapping("/add")
public class Add_Controller {
    @Autowired
    IBookService bookService;

    @GetMapping
    public  String index(Model model){
        //model.addAttribute("message", "Hello Spring MVC!");
        return "ADD";
    }

    @PostMapping
    String add(@RequestParam String name,String author,String publisher,String date,Long quantity) {
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setDate(date);
        book.setQuantity(quantity);
        bookService.save(book);
        //Todo todo = new Todo();
        //todo.setContent(content);
        //todoService.save(todo);
        return "redirect:/list";
    }
}
