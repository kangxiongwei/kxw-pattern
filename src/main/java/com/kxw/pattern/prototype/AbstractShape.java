package com.kxw.pattern.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:37 AM
 */
@Data
@ToString
@EqualsAndHashCode
public abstract class AbstractShape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
