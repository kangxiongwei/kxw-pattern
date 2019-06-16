package com.kxw.pattern.iterator;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:36 AM
 */
public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * 具体的迭代器
     */
    private class NameIterator implements Iterator {

        int index;

        /**
         * 是否有下一个元素
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        /**
         * 获取下一个元素
         *
         * @return
         */
        @Override
        public Object next() {
            return hasNext() ? names[index++] : null;
        }
    }


}
