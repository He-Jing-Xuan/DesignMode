package com.company.ObserverPattern;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/16 4:37 下午
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
