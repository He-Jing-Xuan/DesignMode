package com.company.ObserverPattern;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/16 4:31 下午
 * @Version 1.0
 */
public abstract class Observer {
    // 在顶层类中保留了 一个发布者
    protected Subject subject;
    abstract void update();
}
