package com.kxw.pattern.templatemethod;

/**
 * 抽象的计算类
 *
 * @author kangxiongwei
 * @date 2019/6/12 1:20 AM
 */
public abstract class AbstractCalculator {

    /**
     * 抽象计算方法
     *
     * @param num1
     * @param num2
     * @return
     */
    abstract int calculate(int num1, int num2);

    /**
     * 计算的模板方法
     *
     * @param expression
     * @param opt
     * @return
     */
    public int calculate(String expression, String opt) {
        //解析
        String[] nums = expression.split(opt);
        int num1 = Integer.parseInt(nums[0].trim());
        int num2 = Integer.parseInt(nums[1].trim());
        //计算
        return this.calculate(num1, num2);
    }


}
