package com.ukou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ukou.mapper")
public class UkouApplication {

    public static void main(String[] args) {
        SpringApplication.run(UkouApplication.class, args);
    }

}
