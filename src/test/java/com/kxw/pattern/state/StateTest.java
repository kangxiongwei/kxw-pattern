package com.kxw.pattern.state;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:45 AM
 */
public class StateTest {

    @Test
    public void test() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }


}
