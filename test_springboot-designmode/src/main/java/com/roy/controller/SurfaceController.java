package com.roy.controller;

import com.roy.service.ISurfTheInternetService;
import com.roy.service.SurfDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 12:56 2022/11/23
 */
public class SurfaceController {

    @Autowired
    @Qualifier("fadInternetCafeService")
    ISurfTheInternetService fadInternetCafeService;


    @Autowired
    @Qualifier("retroInternetBarService")
    ISurfTheInternetService retroInternetBarService;


    @GetMapping("/doTest")
    public void doTest() {
        fadInternetCafeService.doSurfing();
        retroInternetBarService.doSurfing();
    }

    @GetMapping("/useDecoratorTest")
    public void useDecoratorTest() {

        SurfDecorator fadInternetCafeDecoratorService = new SurfDecorator(fadInternetCafeService);
        fadInternetCafeDecoratorService.doSurfing();

        SurfDecorator retroInternetBarDecoratorService = new SurfDecorator(retroInternetBarService);
        retroInternetBarDecoratorService.doSurfing();

    }
}
