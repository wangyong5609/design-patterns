package com.bbbwdc.observer.pattern.observer;

public class XiaoliObserver implements IObserver {
    @Override
    public void update(String videoTitle) {
        String name = "小李";
        System.out.println(name + ", 快来看我的新视频: " + videoTitle);
    }
}
