package com.kxw.pattern.visitor;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:49 AM
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
