package com.bbbwdc.proxy.virtualproxy;

/**
 * 真实视频类
 */
public class RealVideo implements Video {
    private String filename;

    public RealVideo(String filename) {
        this.filename = filename;
        loadVideoFromDisk();
    }

    /**
     * 从磁盘加载视频
     */
    private void loadVideoFromDisk() {
        System.out.println("Loading video: " + filename);
        // 模拟加载时间，假设加载时间为2秒
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + filename);
    }
}