package com.bbbwdc.proxy.protectionproxy;

/**
 * 图书代理
 */
public class BookProxy implements Book {
    // 真实图书
    private RealBook realBook;
    // 用户角色
    private String role;

    public BookProxy(RealBook realBook, String role) {
        this.realBook = realBook;
        this.role = role;
    }

    @Override
    public void viewBooks() {
        realBook.viewBooks();
    }

    @Override
    public void addBook(String bookName) {
        // 只有管理员可以添加书籍
        if (role.equals("ADMIN")) {
            realBook.addBook(bookName);
        } else {
            System.out.println("访问被拒绝：" + role + " 没有权限添加书籍。");
        }
    }

    @Override
    public void removeBook(String bookName) {
        // 只有管理员可以删除书籍
        if (role.equals("ADMIN")) {
            realBook.removeBook(bookName);
        } else {
            System.out.println("访问被拒绝：" + role + " 没有权限删除书籍。");
        }
    }
}