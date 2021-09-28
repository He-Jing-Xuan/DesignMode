package com.company.prototype;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/28 10:51 上午
 * @Version 1.0
 */
public class Circle extends Shape{
    public int raduis;
    public Circle(){
    }
    public Circle(Circle target){
        super(target);
        this.raduis = target.raduis;
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
