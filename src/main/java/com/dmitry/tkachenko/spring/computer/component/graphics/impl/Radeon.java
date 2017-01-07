package com.dmitry.tkachenko.spring.computer.component.graphics.impl;

import com.dmitry.tkachenko.spring.computer.component.graphics.Graphics;

/**
 * Created by thetekst on 1/6/17.
 */
public class Radeon implements Graphics {
    @Override
    public String info() {
        return getClass().getSimpleName();
    }
}
