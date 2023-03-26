package com.roy.controller;

import com.roy.service.calc.ICalculation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 接口类
 * @author dingyawu
 */
@RestController
public class CalculationController {

    private static final Logger logger = LoggerFactory.getLogger(CalculationController.class);


    @Autowired
    Map<String, ICalculation> calculationMap;

    @GetMapping(path = "/calc/{opStr}")
    public String operation(@PathVariable String opStr) {
        ICalculation calculation = calculationMap.getOrDefault(opStr, null);
        if (null == calculation) {
            return "没有找到正确的策略";
        }
        int i = 1;
        int j = 2;
        return calculation.operation(i, j) + "";
    }

}
