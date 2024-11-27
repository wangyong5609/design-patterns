package com.bbbwdc.proxy.protectionproxy;

/**
 * 图书接口
 */
public interface Book {
    /**
     * 查看图书
     */
    void viewBooks();
    /**
     * 添加图书
     * @param bookName 图书名称
     */
    void addBook(String bookName);
    /**
     * 删除图书
     * @param bookName 图书名称
     */
    void removeBook(String bookName);
}
