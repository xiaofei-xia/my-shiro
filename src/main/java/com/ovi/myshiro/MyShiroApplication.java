package com.ovi.myshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ovi.myshiro.mapper")
public class MyShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShiroApplication.class, args);
    }

}
