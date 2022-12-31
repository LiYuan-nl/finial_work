package com.example.finial_work.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.finial_work.entity.Book;
import com.example.finial_work.entity.Review;
import com.example.finial_work.mapper.BookMapper;
import com.example.finial_work.mapper.ReviewMapper;
import com.example.finial_work.service.IBookService;
import com.example.finial_work.service.IReviewService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

@Service
@MapperScan("com/example/finial_work/mapper")
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review> implements IReviewService {
}
