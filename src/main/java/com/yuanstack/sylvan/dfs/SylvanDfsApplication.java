package com.yuanstack.sylvan.dfs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.yuanstack.sylvan.dfs.utils.FileUtils.init;

@SpringBootApplication
public class SylvanDfsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SylvanDfsApplication.class, args);
    }


    // 1. 基于文件存储的分布式文件系统
    // 2. 块存储   ==> 最常见，效率最高 ==> 改造成这个。
    // 3. 对象存储
    @Value("${sylvan-dfs.path}")
    private String uploadPath;

    @Bean
    ApplicationRunner runner() {
        return args -> {
            init(uploadPath);
            System.out.println("dfs started");
        };
    }
}
