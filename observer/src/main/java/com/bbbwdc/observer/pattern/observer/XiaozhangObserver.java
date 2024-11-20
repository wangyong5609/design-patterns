package com.bbbwdc.observer.pattern.observer;

public class XiaozhangObserver implements IObserver {
    @Override
    public void update(String videoTitle) {
        String name = "小张";
        System.out.println(name + ", 快来看我的新视频: " + videoTitle);
    }
}
