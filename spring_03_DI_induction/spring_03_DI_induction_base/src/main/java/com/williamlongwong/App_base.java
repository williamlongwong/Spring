package com.williamlongwong;

import com.williamlongwong.service.BookService;
import com.williamlongwong.service.impl.BookServiceImpl;

public class App_base {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
