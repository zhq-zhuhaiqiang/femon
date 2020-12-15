package com.tecsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 一剑
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.tecsun")
@EnableScheduling
@EnableJpaRepositories("com.tecsun")
public class Application {

    public static void main(String[] args) {
        // 启动Spring Boot项目的唯一入口
        SpringApplication.run(Application.class, args);

    }

}
