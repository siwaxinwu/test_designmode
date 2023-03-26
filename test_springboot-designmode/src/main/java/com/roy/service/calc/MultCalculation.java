package com.roy.service.calc;

import org.springframework.stereotype.Service;

/**
 * @author dingyawu
 */
@Service("mult")
public class MultCalculation implements ICalculation {
    @Override
    public int operation(int i, int j) {
        return i*j;
    }
}
