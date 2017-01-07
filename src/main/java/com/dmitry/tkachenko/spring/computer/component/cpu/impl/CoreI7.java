package com.dmitry.tkachenko.spring.computer.component.cpu.impl;

import com.dmitry.tkachenko.spring.computer.component.cpu.CPU;

/**
 * Created by thetekst on 1/6/17.
 */
public class CoreI7 implements CPU {
    @Override
    public String info() {
        return "Core i7";
    }
}
