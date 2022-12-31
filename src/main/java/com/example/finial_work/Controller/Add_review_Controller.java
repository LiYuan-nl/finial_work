package com.example.finial_work.Controller;

import com.example.finial_work.entity.Book;
import com.example.finial_work.entity.Review;
import com.example.finial_work.service.IBookService;
import com.example.finial_work.service.IReviewService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@MapperScan("com/example/finial_work/mapper")
@RequestMapping("/addrev")
public class Add_review_Controller {
    @Autowired
    IReviewService reviewService;

    @GetMapping
    public  String index(Model model){
        //model.addAttribute("message", "Hello Spring MVC!");
        return "ADDRE";
    }

    @PostMapping
    String add(@RequestParam  Long book_id,String content) {
        Review review = new Review();
        review.setBook_id(book_id);
        review.setContent(content);
        //Todo todo = new Todo();
        //todo.setContent(content);
        //todoService.save(todo);
        return "redirect:/review";
    }
}
