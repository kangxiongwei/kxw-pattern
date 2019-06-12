package com.kxw.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author kangxiongwei
 * @date 2019/6/12 11:21 PM
 */
public class JdkProxyImage implements InvocationHandler {

    private Image realImage;

    public JdkProxyImage(Image realImage) {
        this.realImage = realImage;
    }

    /**
     * 获取代理对象
     *
     * @return
     */
    public Image getProxyImage() {
        ClassLoader classLoader = JdkProxyImage.class.getClassLoader();
        Class[] classes = new Class[]{Image.class};
        return (Image) Proxy.newProxyInstance(classLoader, classes, this);
    }

    /**
     * 执行被代理的方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy image running!");
        return method.invoke(realImage, args);
    }
}
