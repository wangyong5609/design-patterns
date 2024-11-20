package com.bbbwdc.observer.pattern.observer;

public class XiaoyangObserver implements IObserver {
    @Override
    public void update(String videoTitle) {
        String name = "小杨";
        System.out.println(name + ", 快来看我的新视频: " + videoTitle);
    }
}
