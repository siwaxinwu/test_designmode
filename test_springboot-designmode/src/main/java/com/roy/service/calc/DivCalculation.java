package com.roy.service.calc;

import org.springframework.stereotype.Service;

/**
 * @author dingyawu
 */
@Service("div")
public class DivCalculation implements ICalculation {
    @Override
    public int operation(int i, int j) {
        return i/j;
    }
}
