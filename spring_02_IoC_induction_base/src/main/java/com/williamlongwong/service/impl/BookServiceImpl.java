package com.williamlongwong.service.impl;

import com.williamlongwong.dao.BookDao;
import com.williamlongwong.dao.impl.BookDaoImpl;
import com.williamlongwong.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
