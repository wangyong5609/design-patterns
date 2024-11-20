package com.bbbwdc.observer.pattern.subject;

import com.bbbwdc.observer.pattern.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 抖音博主
 */
public class DouyinBloggerSubject implements ISubject {
    // 粉丝列表
    private List<IObserver> followers;
    // 最新视频标题
    private String latestVideoTitle;

    public DouyinBloggerSubject() {
        followers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver follower : followers) {
            follower.update(latestVideoTitle);
        }
    }

    // 模拟发布新视频
    public void publishNewVideo(String title) {
        this.latestVideoTitle = title;
        System.out.println("博主发布了新视频: " + title);
        notifyObservers(); // 通知所有粉丝
    }
}