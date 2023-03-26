package com.roy.service;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 12:57 2022/11/23
 */

public class SurfDecorator implements  ISurfTheInternetService {

    /**
     * 内部维护一个冲浪接口类
     */
    private ISurfTheInternetService surfTheInternetService;

    /**
     * 构造方法 把传入的 类 赋值给内部类
     * @param surfTheInternetService
     */
    public SurfDecorator(ISurfTheInternetService surfTheInternetService) {
        this.surfTheInternetService = surfTheInternetService;
    }

    /**
     * 增强的网上冲浪方法
     */
    @Override
    public void doSurfing() {

        System.out.println("SurfDecorator 模拟业务 增强器在玩一点很新的东西,可能是一些额外的职责业务....");
        //增强
        surfTheInternetService.doSurfing();
        System.out.println("SurfDecorator 模拟业务 增强器在玩一点很新的东西,可能是一些额外的职责业务，比如说是XXXX");
    }

}