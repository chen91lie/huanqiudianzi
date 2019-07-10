package com.chenlie.userserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCaching
@MapperScan(basePackages = {"com.chenlie.userserver.dao"})
@SpringBootApplication
@EnableEurekaClient
public class UserserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserverApplication.class, args);
    }

}
