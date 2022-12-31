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
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@MapperScan("com/example/finial_work/mapper")
@RequestMapping("/review")
public class Review_Controller {
    @Autowired
    IReviewService reviewService;

    @GetMapping
    String list(Model model) {
        List<Review> reviews = reviewService.list();
        model.addAttribute("reviews", reviews);
        return "REVIEW";
    }
}
