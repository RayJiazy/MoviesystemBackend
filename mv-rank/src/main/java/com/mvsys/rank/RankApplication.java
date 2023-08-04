package com.mvsys.rank;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// 开启服务注册与发现功能
@EnableDiscoveryClient
@MapperScan("com.mvsys.rank.mapper")
public class RankApplication {
    public static void main(String[] args) {
        SpringApplication.run(RankApplication.class, args);
    }
}