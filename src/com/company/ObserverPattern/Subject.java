package com.company.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author he-jing-xuan
 * @Date 2021/9/16 4:31 下午
 * @Version 1.0
 */
public class Subject {
   private List<Observer> observerList = new ArrayList<>();
   private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 状态发生改变 发出通知
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }
}
