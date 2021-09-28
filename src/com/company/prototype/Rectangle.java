package com.company.prototype;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/28 10:53 上午
 * @Version 1.0
 */
public class Rectangle extends Shape{
    public int width;
    public int hegiht;
    public Rectangle(){}
    private Rectangle(Rectangle target){
        super(target);
        this.width = target.width;
        this.hegiht = target.hegiht;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
