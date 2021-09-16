package com.company.ObserverPattern;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/16 4:35 下午
 * @Version 1.0
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
