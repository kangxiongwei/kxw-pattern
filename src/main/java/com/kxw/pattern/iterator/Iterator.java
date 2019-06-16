package com.kxw.pattern.iterator;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:34 AM
 */
public interface Iterator {

    /**
     * 是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    Object next();

}
