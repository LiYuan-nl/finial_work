package com.example.finial_work.Controller;

import com.example.finial_work.entity.Book;
import com.example.finial_work.service.IBookService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@MapperScan("com/example/finial_work/mapper")
@RequestMapping("/edit")
public class Edit_Controller {
    @Autowired
    IBookService bookService;

    @GetMapping
    String editForm(Model model, @RequestParam int id) {
        Book book = bookService.getById(id);
        model.addAttribute("book", book);
        return "EDIT";
    }

    @PostMapping
    String edit(@ModelAttribute Book book) {
        bookService.updateById(book);
        return "redirect:/list";
    }
}
