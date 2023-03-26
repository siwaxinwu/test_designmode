package com.roy.observe.demo1;

/**
 * 具体观察者角色实现类
 * @author sec
 **/
public class ConcreteObserver extends AbstractObserver{

    @Override
    public void receiveMsg(String context) {
        System.out.println("具体观察者角色接收消息: " + context);
    }
}