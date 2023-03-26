package com.roy.service.impl;

import com.roy.service.ISurfTheInternetService;
import org.springframework.stereotype.Service;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 12:38 2022/11/23
 */
@Service("retroInternetBarService")
public class RetroInternetBar implements ISurfTheInternetService {

    @Override
    public void doSurfing() {
        System.out.println("在复古 网吧 ,网上冲浪咯~");
    }
}