package com.roy.observe.demo1;

/**
 * @Author: dingyawu
 * @Description: 被观察者里面有一个观察者的集合
 * @Date: Created in 18:35 2022/11/17
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题（抽象被观察者角色）
 * @author sec
 **/
public abstract class AbstractSubject {

    /**
     * 持有所有抽象观察者角色的集合引用
     */
    private final List<AbstractObserver> observers = new ArrayList<>();

    /**
     * 添加一个观察者
     * @param observer 观察者
     */
    public void addObserver(AbstractObserver observer){
        observers.add(observer);
    }

    /**
     * 移除一个观察者
     * @param observer 观察者
     */
    public void removeObserver(AbstractObserver observer){
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者，执行观察者更新方法
     * @param context 通知内容
     */
    public void notifyObserver(String context){
        observers.forEach(observer -> observer.receiveMsg(context));
    }
}