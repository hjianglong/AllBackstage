package com.rx.allbackstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rx.allbackstage.mapper")
public class AllBackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllBackstageApplication.class, args);
    }

}
