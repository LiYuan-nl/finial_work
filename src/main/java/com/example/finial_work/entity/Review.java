package com.example.finial_work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Review {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long book_id;
    private String content;
}
