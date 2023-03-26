package com.roy.observe.demo2;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 18:39 2022/11/17
 */

import lombok.Data;

import java.util.EventObject;

/**
 * 事件对象
 *
 * @author sec
 **/
@Data
public class DoorEvent extends EventObject {

    private int state;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DoorEvent(Object source) {
        super(source);
    }

    public DoorEvent(Object source, int state) {
        super(source);
        this.state = state;
    }


}