package com.dmitry.tkachenko.spring.computer.component.motherboard.impl;

import com.dmitry.tkachenko.spring.computer.component.motherboard.Motherboard;

/**
 * Created by thetekst on 1/6/17.
 */
public class Asus implements Motherboard {
    @Override
    public String info() {
        return getClass().getSimpleName();
    }
}
