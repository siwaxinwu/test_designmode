package com.roy.observe.demo2;

import java.util.Vector;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 20:28 2022/11/17
 */
public class EventSource {

    //监听器列表，监听器的注册则加入此列表
    private Vector<DoorListener> listenerList = new Vector<>();

    //注册监听器
    public void addListener(DoorListener eventListener) {
        listenerList.add(eventListener);
    }

    //撤销注册
    public void removeListener(DoorListener eventListener) {
        listenerList.remove(eventListener);
    }

    //接受外部事件
    public void notifyListenerEvents(DoorEvent event) {
        for (DoorListener eventListener : listenerList) {
            eventListener.doorEvent(event);
        }
    }
}