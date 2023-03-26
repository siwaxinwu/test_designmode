package com.roy.observe.demo2;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 18:46 2022/11/17
 */
public class CloseDoorListener implements DoorListener{
    @Override
    public void doorEvent(DoorEvent doorEvent) {
        if(doorEvent.getState() == -1){
            System.out.println("门关上了");
        }
    }
}
