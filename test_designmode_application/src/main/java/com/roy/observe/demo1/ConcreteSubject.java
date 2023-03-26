package com.roy.observe.demo1;


/**
 * 具体被观察者
 * @author sec
 **/
public class ConcreteSubject extends AbstractSubject{

    /**
     * 被观察者发送消息
     * @param context 消息内容
     */
    public void sendMsg(String context){
        System.out.println("具体被观察者角色发送消息: " + context);
        super.notifyObserver(context);
    }
}