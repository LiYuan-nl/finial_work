package com.example.finial_work.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.finial_work.entity.Book;
import com.example.finial_work.mapper.BookMapper;
import com.example.finial_work.service.IBookService;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

@Service
@MapperScan("com/example/finial_work/mapper")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
}
