package com.example.finial_work;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/finial_work/mapper")
public class FinialWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinialWorkApplication.class, args);
    }

}
