package com.kxw.pattern.builder;

/**
 * 服务员
 *
 * @author kangxiongwei
 * @date 2019/6/20 8:29 AM
 */
public class MealWaiter {

    private MealBuilder mealBuilder;

    public MealWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    /**
     * 订餐
     *
     * @return
     */
    public Meal bookMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }


}
