package com.company.prototype;

import java.util.Objects;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/28 10:49 上午
 * @Version 1.0
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;
    public Shape(){
    }
    public Shape(Shape target){
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }
    public abstract Shape clone();
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
