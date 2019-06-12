package com.kxw.pattern.templatemethod;

/**
 * 抽象的计算类
 *
 * @author kangxiongwei
 * @date 2019/6/12 1:20 AM
 */
public abstract class AbstractCalculator {

    /**
     * 切分计算值
     *
     * @param expression
     * @param opt
     * @return
     */
    private int[] split(String expression, String opt) {
        int[] numArray = new int[2];
        String[] nums = expression.split(opt);
        int num1 = Integer.parseInt(nums[0].trim());
        int num2 = Integer.parseInt(nums[1].trim());
        numArray[0] = num1;
        numArray[1] = num2;
        return numArray;
    }


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
    public int execute(String expression, String opt) {
        //先执行什么
        int[] nums = split(expression, opt);
        //再执行什么
        return this.calculate(nums[0], nums[1]);
    }

}
