package com.kxw.pattern.singleton;

/**
 * 单例模式
 *
 * @author kangxiongwei
 * @date 2019/6/12 1:12 AM
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }

    /**
     * 对外暴露的获取单例对象方法
     *
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * 线程安全的单例
     *
     * @return
     */
    public static Singleton getSyncSingleton() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
