package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void startupMessage() {
        System.out.println("\n========================================");
        System.out.println("  图书管理系统启动成功！");
        System.out.println("  登录地址: http://localhost:8099/login");
        System.out.println("  账号: admin  密码: 123456");
        System.out.println("========================================\n");
    }

}
