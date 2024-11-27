package com.bbbwdc.proxy.virtualproxy;

/**
 * 视频代理
 */
public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String filename;

    public ProxyVideo(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        // 只有在需要时才加载真实视频
        if (realVideo == null) {
            realVideo = new RealVideo(filename);
        }
        realVideo.play();
    }
}