package com.company;


import com.company.Duty.ConcreteHandler1;
import com.company.Duty.ConcreteHandler2;
import com.company.Duty.Handler;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler2.setNext(handler1);
        handler2.handlerRequest("one");
    }
}
