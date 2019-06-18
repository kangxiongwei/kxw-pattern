package com.kxw.pattern.abstractfactory;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:50 AM
 */
public class GreenColor implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        System.out.println("[Green] filling!");
    }
}
