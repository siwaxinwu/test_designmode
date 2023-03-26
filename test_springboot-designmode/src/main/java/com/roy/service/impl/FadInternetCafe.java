package com.roy.service.impl;

import com.roy.service.ISurfTheInternetService;
import org.springframework.stereotype.Service;

/**
 * @Author: dingyawu
 * @Description: TODO
 * @Date: Created in 12:37 2022/11/23
 */

@Service("fadInternetCafeService")
public class FadInternetCafe implements ISurfTheInternetService {

    @Override
    public void doSurfing() {

        System.out.println("在时尚 网咖 ,网上冲浪咯~");

    }
}