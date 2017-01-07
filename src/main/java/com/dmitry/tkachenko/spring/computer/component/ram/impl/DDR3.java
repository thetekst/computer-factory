package com.dmitry.tkachenko.spring.computer.component.ram.impl;

import com.dmitry.tkachenko.spring.computer.component.ram.RAM;

/**
 * Created by dmitry tkachenko on 1/6/17.
 */
public class DDR3 implements RAM {
    @Override
    public String info() {
        return getClass().getSimpleName();
    }
}
