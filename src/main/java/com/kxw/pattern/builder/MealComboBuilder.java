package com.kxw.pattern.builder;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:26 AM
 */
public class MealComboBuilder extends MealBuilder {

    @Override
    void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    void buildDrink() {
        meal.setDrink("可乐");
    }
}
