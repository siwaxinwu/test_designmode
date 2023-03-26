package com.roy.observe.demo1;


/**
 * 抽象观察者角色
 * @author sec
 **/
public abstract class AbstractObserver {

    /**
     * 接收消息
     * @param context 消息内容
     */
    public abstract void receiveMsg(String context);

}