package com.example.finial_work.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.finial_work.entity.Book;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;


public interface BookMapper extends BaseMapper<Book> {
}
