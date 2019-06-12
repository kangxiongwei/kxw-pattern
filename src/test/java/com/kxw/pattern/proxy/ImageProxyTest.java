package com.kxw.pattern.proxy;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/12 11:16 PM
 */
public class ImageProxyTest {

    /**
     * 测试静态代理
     */
    @Test
    public void testStaticProxy() {
        ProxyImage proxyImage = new ProxyImage(new RealImage());
        proxyImage.display();
    }

    @Test
    public void testJdkProxy() {
        Image proxyImage = new JdkProxyImage(new RealImage()).getProxyImage();
        proxyImage.display();
    }

    @Test
    public void testCglibProxy() {
        Image proxyImage = new CglibProxyImage(new RealImage()).getCglibProxy();
        proxyImage.display();
    }
}
