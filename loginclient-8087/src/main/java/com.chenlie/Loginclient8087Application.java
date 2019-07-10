package com.chenlie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCaching
@MapperScan(basePackages = {"com.chenlie.userserver.dao"})
@SpringBootApplication
@EnableEurekaClient
public class Loginclient8087Application {

    public static void main(String[] args) {
        SpringApplication.run(Loginclient8087Application.class, args);
    }

}
