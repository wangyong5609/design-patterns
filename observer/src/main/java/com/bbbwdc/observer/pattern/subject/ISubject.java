package com.bbbwdc.observer.pattern.subject;

import com.bbbwdc.observer.pattern.observer.IObserver;

/**
 * 主题接口
 */
public interface ISubject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(IObserver observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(IObserver observer);
    /**
     * 通知观察者
     */
    void notifyObservers();
}
