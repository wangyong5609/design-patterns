package com.bbbwdc;


import com.bbbwdc.proxy.protectionproxy.Book;
import com.bbbwdc.proxy.protectionproxy.BookProxy;
import com.bbbwdc.proxy.protectionproxy.RealBook;
import com.bbbwdc.proxy.virtualproxy.ProxyVideo;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testVirtualProxy() {
        ProxyVideo video1 = new ProxyVideo("video1.mp4");
        ProxyVideo video2 = new ProxyVideo("video2.mp4");
        System.out.println("Ready to play video1...");
        video1.play(); // 第一次调用，加载视频
        System.out.println();

        System.out.println("Ready to play video1 again...");
        video1.play(); // 第二次调用，直接播放视频
        System.out.println();

        System.out.println("Ready to play video2...");
        video2.play(); // 第一次调用，加载视频
        System.out.println();
    }

    @Test
    public void testProtectionProxy() {
        RealBook realBook = new RealBook();

        // 创建代理对象，分别为管理员和普通用户
        Book adminProxy = new BookProxy(realBook, "ADMIN");
        Book userProxy = new BookProxy(realBook, "USER");

        // 管理员用户可以查看书籍
        System.out.println("管理员尝试查看书籍：");
        adminProxy.viewBooks(); // 允许执行

        // 普通用户也可以查看书籍
        System.out.println("普通用户尝试查看书籍：");
        userProxy.viewBooks(); // 允许执行

        // 普通用户尝试添加书籍
        System.out.println("普通用户尝试添加书籍：");
        userProxy.addBook("设计模式之禅");
        
        // 管理员可以添加书籍
        System.out.println("管理员尝试添加书籍：");
        adminProxy.addBook("深入理解Java虚拟机");

        // 普通用户尝试删除书籍
        System.out.println("普通用户尝试删除书籍：");
        userProxy.removeBook("Java 编程思想");

        // 管理员可以删除书籍
        System.out.println("管理员尝试删除书籍：");
        adminProxy.removeBook("Java 编程思想");

        // 查看当前书籍列表
        System.out.println("查看当前书籍列表：");
        adminProxy.viewBooks();
    }
}
