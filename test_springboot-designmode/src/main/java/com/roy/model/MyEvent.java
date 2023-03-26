package com.roy.model;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 20:31 2022/11/17
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }

    private String context;

    public MyEvent(Object source, String context){
        super(source);
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}