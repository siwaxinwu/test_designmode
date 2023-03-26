package com.roy.observe.demo3;
import java.util.Observable;
/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 17:20 2022/12/27
 */


public class Stock extends Observable {
    private String name;
    private float price;

    public Stock(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        if(this.price < price){
            this.setChanged();
            this.notifyObservers(price);
            this.price = price;
        }
    }
}