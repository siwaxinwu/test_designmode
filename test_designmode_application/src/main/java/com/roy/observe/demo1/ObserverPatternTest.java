package com.roy.observe.demo1;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 18:36 2022/11/17
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.sendMsg("Hello World!");
    }
}