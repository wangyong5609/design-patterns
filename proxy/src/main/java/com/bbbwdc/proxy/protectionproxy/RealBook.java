package com.bbbwdc.proxy.protectionproxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 真实图书
 */
public class RealBook implements Book {
    // 图书列表
    private List<String> books;

    public RealBook() {
        books = new ArrayList<>();
        books.add("Java 编程思想");
        books.add("设计模式：可复用面向对象软件的基础");
    }

    @Override
    public void viewBooks() {
        System.out.println("当前书籍列表：");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    @Override
    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("已添加书籍：" + bookName);
    }

    @Override
    public void removeBook(String bookName) {
        books.remove(bookName);
        System.out.println("已删除书籍：" + bookName);
    }
}