package com.kxw.pattern.builder;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:27 AM
 */
public class MealComboBuilder2 extends MealBuilder {

    @Override
    void buildFood() {
        meal.setFood("鸡翅");
    }

    @Override
    void buildDrink() {
        meal.setDrink("柠檬果汁");
    }
}
