package com.williamlongwong.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_pro {
    public static void main(String[] args) {
        //4.初始化IoC容器，通过容器获取bean（根据bean配置id获取）
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//      BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//      bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
