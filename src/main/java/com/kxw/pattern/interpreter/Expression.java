package com.kxw.pattern.interpreter;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:17 AM
 */
public interface Expression {

    boolean interpret(String context);

}
