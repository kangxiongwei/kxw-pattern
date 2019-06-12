package com.kxw.pattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author kangxiongwei
 * @date 2019/6/12 11:39 PM
 */
public class CglibProxyImage implements MethodInterceptor {

    private Image realImage;

    public CglibProxyImage(Image realImage) {
        this.realImage = realImage;
    }

    public Image getCglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(realImage.getClass());
        enhancer.setCallback(this);
        return (Image) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib proxy!");
        return method.invoke(realImage, args);
    }
}
