package com.kxw.pattern.visitor;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:55 AM
 */
public class CpmputeVisitorTest {

    @Test
    public void test() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }



}
