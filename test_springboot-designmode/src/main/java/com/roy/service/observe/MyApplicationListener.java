package com.roy.service.observe;

import com.roy.model.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 20:32 2022/11/17
 */
@Component
public class MyApplicationListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        // 监听到具体事件，处理对应具体逻辑
        System.out.println("event.getContext() = " + event.getContext());
    }

}