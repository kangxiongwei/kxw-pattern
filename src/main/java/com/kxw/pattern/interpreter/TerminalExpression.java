package com.kxw.pattern.interpreter;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:17 AM
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
