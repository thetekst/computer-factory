package com.dmitry.tkachenko.spring.computer.component.storage.impl;

import com.dmitry.tkachenko.spring.computer.component.storage.Storage;

/**
 * Created by dmitry tkachenko on 1/6/17.
 */
public class HGST implements Storage {
    @Override
    public String info() {
        return getClass().getSimpleName();
    }
}
