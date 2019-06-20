package com.kxw.pattern.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, AbstractShape> shapeMap = new Hashtable<String, AbstractShape>();

    public static AbstractShape getCloneShape(String shapeId) {
        AbstractShape cachedShape = shapeMap.get(shapeId);
        try {
            //返回对象的克隆
            return (AbstractShape) cachedShape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static AbstractShape getShape(String shapeId) {
        return shapeMap.get(shapeId);
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        CircleShape circle = new CircleShape();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        RectangleShape rectangle = new RectangleShape();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}