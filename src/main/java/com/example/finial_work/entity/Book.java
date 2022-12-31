package com.example.finial_work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Book {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String author;
    private String publisher;
    private String date;
    private Long quantity;
}
