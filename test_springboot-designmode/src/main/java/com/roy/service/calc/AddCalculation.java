package com.roy.service.calc;

import org.springframework.stereotype.Service;

/**
 * @author dingyawu
 */
@Service("add")
public class AddCalculation implements ICalculation {
    @Override
    public int operation(int i, int j) {
        return i+j;
    }
}
