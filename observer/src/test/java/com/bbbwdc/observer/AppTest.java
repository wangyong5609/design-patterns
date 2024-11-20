package com.bbbwdc.observer;

import com.bbbwdc.observer.pattern.observer.*;
import com.bbbwdc.observer.pattern.subject.DouyinBloggerSubject;
import com.bbbwdc.observer.shit.DouyinBlogger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shit() {
        DouyinBlogger douyinBlogger = new DouyinBlogger();
        douyinBlogger.publishNewVideo("国足五年来首次对日本破门");
        
        douyinBlogger.notifyFollower("小王");
        douyinBlogger.notifyFollower("小李");
        douyinBlogger.notifyFollower("小张");
        douyinBlogger.notifyFollower("小杨");
        douyinBlogger.notifyFollower("小明");
        douyinBlogger.notifyFollower("小红");
        douyinBlogger.notifyFollower("小赵");
        douyinBlogger.notifyFollower("小何");
        douyinBlogger.notifyFollower("其他N个粉丝");
    }

    @Test
    public void pattern() {
        DouyinBloggerSubject blogger = new DouyinBloggerSubject();
        blogger.registerObserver(new XiaowangObserver());
        blogger.registerObserver(new XiaoliObserver());
        blogger.registerObserver(new XiaozhangObserver());
        blogger.registerObserver(new XiaoyangObserver());
        blogger.registerObserver(new XiaomingObserver());
        XiaohongObserver xiaohongObserver = new XiaohongObserver();
        blogger.registerObserver(xiaohongObserver);
        blogger.publishNewVideo("国足五年来首次对日本破门");

        blogger.removeObserver(xiaohongObserver);
        
        blogger.publishNewVideo("李子柒复出");
    }
}
