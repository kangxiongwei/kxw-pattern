package com.kxw.pattern.builder;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:23 AM
 */
public abstract class MealBuilder {

    Meal meal = new Meal();

    abstract void buildFood();

    abstract void buildDrink();

    /**
     * 获取产品
     *
     * @return
     */
    public Meal getMeal() {
        return meal;
    }
}
