图书管理系统

项目技术栈

图书后台管理系统，采用SpringBoot+Mybatius，页面使用Element框架，使用RESTful API风格编写接口。

数据库使用mysql

Spring Boot

MyBatis-puls

MySQL

ElementUI

项目工具:  

IntelliJ IDEA 2024.2.2+Navicat Premium 16+ElementUI

已实现功能

- [x] 基本增删改查,联表查询
- [x] 拦截器登录验证

  
项目预览

账号:admin 密码:123456


运行步骤
1创建数据库
CREATE DATABASE IF NOT EXISTS ssm_db CHARACTER SET utf8mb4;
2导入根目录下的sql文件
library.sql
3修改数据库链接
修改修改 src/main/resources/config/application.yml中的账号密码
4在IntelliJ IDEA中运行项目
运行启动类src/main/java/com/itheima/Application.java
