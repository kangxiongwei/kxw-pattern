package com.kxw.pattern.iterator;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:39 AM
 */
public class IteratorTest {

    @Test
    public void test() {
        NameRepository repository = new NameRepository();
        Iterator iterator = repository.getIterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }



}
