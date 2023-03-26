package com.roy.observe.demo2;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 18:45 2022/11/17
 */

import java.util.EventListener;

/**
 * 事件监听器接口
 *
 * @author sec
 **/
public interface DoorListener extends EventListener {

    /**
     * 门处理事件
     * @param doorEvent 事件
     */
    void doorEvent(DoorEvent doorEvent);
}