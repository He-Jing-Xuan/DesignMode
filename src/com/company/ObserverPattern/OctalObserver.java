package com.company.ObserverPattern;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/16 4:36 下午
 * @Version 1.0
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );

    }
}
