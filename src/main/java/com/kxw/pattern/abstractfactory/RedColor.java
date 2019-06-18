package com.kxw.pattern.abstractfactory;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:49 AM
 */
public class RedColor implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        System.out.println("[Red] filling!");
    }
}
