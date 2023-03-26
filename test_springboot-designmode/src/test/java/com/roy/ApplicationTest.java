package com.roy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: dingyawu
 * @Description: 自定义测试自己封装的starter
 * @Date: Created in 22:36 2022/11/9
 */
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {




    @Test
    public void testStarter() {
        System.out.println("hello");
    }
}