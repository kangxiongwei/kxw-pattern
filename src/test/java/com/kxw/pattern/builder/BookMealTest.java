package com.kxw.pattern.builder;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:30 AM
 */
public class BookMealTest {

    @Test
    public void test1() {
        MealBuilder builder = new MealComboBuilder();
        MealWaiter waiter = new MealWaiter(builder);
        Meal meal = waiter.bookMeal();
        System.out.println(meal);
    }

    @Test
    public void test2() {
        MealBuilder builder = new MealComboBuilder2();
        MealWaiter waiter = new MealWaiter(builder);
        Meal meal = waiter.bookMeal();
        System.out.println(meal);
    }

}
