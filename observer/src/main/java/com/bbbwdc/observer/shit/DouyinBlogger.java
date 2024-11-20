package com.bbbwdc.observer.shit;

/**
 * 抖音博主
 */
public class DouyinBlogger {
    private String latestVideoTitle;

    // 模拟发布新视频
    public void publishNewVideo(String title) {
        this.latestVideoTitle = title;
        System.out.println("博主发布了新视频: " + title);
    }

    // 通知粉丝
    public void notifyFollower(String userName) {
        System.out.println(userName + ", 快来看我的新视频: " + latestVideoTitle);
    }


    public String getLatestVideoTitle() {
        return latestVideoTitle;
    }

    public void setLatestVideoTitle(String latestVideoTitle) {
        this.latestVideoTitle = latestVideoTitle;
    }
}
