package com.roy;

import com.roy.model.MyEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 20:34 2022/11/17
 */
@SpringBootTest
public class SpringEventTest {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Test
    void testEvent() {
        eventPublisher.publishEvent(new MyEvent("自定义事件", "Hello World！"));
    }
}
