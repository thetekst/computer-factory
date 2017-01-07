package com.dmitry.tkachenko.spring.computer.component.cpu.impl;

import com.dmitry.tkachenko.spring.computer.component.cpu.CPU;

/**
 * Created by thetekst on 1/6/17.
 */
public class Athlon implements CPU {
    @Override
    public String info() {
        return getClass().getSimpleName();
    }
}
