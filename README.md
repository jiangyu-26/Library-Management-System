# 📚 图书管理系统

> 基于 Spring Boot + MyBatis-Plus 构建的图书后台管理系统

---

## 🛠️ 技术栈

| 分类 | 技术 | 版本 |
| :--- | :--- | :--- |
| 后端框架 | Spring Boot | 3.x |
| ORM框架 | MyBatis-Plus | 3.x |
| 数据库 | MySQL | 8.0+ |
| 前端框架 | ElementUI | 2.x |
| 构建工具 | Maven | 3.8+ |

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![MyBatis-Plus](https://img.shields.io/badge/MyBatis%20Plus-3.x-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0+-orange)
![ElementUI](https://img.shields.io/badge/ElementUI-2.x-purple)

---

## 🎯 已实现功能

- ✅ 图书管理（增删改查、联表查询）
- ✅ 读者管理（增删改查）
- ✅ 借阅管理（借书、还书）
- ✅ 用户管理（登录、权限控制）
- ✅ 拦截器登录验证
- ✅ RESTful API 风格接口

---

## 📁 项目结构

```plaintext
LibraryManagement/
├── src/main/java/com/itheima/
│   ├── Application.java          # 启动类
│   ├── Interceptor/              # 拦截器
│   │   └── LoginHandlerInterceptor.java
│   ├── config/                   # 配置类
│   │   ├── MPConfig.java
│   │   └── MvcConfig.java
│   ├── controller/               # 控制器
│   │   ├── utils/                # 工具类
│   │   ├── BookController.java
│   │   ├── BorrowControler.java
│   │   ├── IndexController.java
│   │   ├── ReaderController.java
│   │   └── UserController.java
│   ├── service/                  # 服务层
│   │   ├── impl/                 # 服务实现
│   │   ├── IBookService.java
│   │   ├── IBorrwoService.java
│   │   ├── IReaderService.java
│   │   └── UserService.java
│   ├── dao/                      # 数据访问层
│   │   ├── BookDao.java
│   │   ├── BorrowDao.java
│   │   ├── ReaderDao.java
│   │   └── UserDao.java
│   └── domain/                   # 实体类
│       ├── Book.java
│       ├── Borrow.java
│       ├── Reader.java
│       └── User.java
├── src/main/resources/
│   ├── config/
│   │   └── application.yml       # 应用配置
│   ├── static/                   # 静态资源
│   └── templates/                # 模板文件
├── src/test/                     # 测试类
├── library.sql                   # 数据库脚本
└── pom.xml                       # Maven配置
```

---

## 🚀 运行步骤

### 1. 创建数据库

```sql
CREATE DATABASE IF NOT EXISTS ssm_db CHARACTER SET utf8mb4;
```

### 2. 导入数据

执行根目录下的 SQL 文件：`library.sql`

### 3. 配置数据库连接

修改 `src/main/resources/config/application.yml` 中的数据库账号密码：

```yaml
spring:
  datasource:
    username: your_username
    password: your_password
```

### 4. 运行项目

在 IntelliJ IDEA 中运行启动类：`src/main/java/com/itheima/Application.java`

---

## 🔑 测试账号

> **注意：** 以下为测试环境账号，生产环境请修改密码

| 账号 | 密码 |
| :--- | :--- |
| admin | 123456 |

---

## 📦 开发工具

- **IDE**: IntelliJ IDEA 2024.2.2
- **数据库**: Navicat Premium 16
- **前端**: ElementUI

---

