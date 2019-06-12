package com.kxw.pattern.proxy;

/**
 * @author kangxiongwei
 * @date 2019/6/12 11:13 PM
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    public ProxyImage(RealImage realImage) {
        this.realImage = realImage;
    }

    /**
     * 展示图片方法
     */
    @Override
    public void display() {
        System.out.println("Before I am proxy image!");
        this.realImage.display();
        System.out.println("After I am proxy image!");
    }
}
