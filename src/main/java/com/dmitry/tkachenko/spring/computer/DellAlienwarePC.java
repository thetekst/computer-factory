package com.dmitry.tkachenko.spring.computer;

import com.dmitry.tkachenko.spring.computer.component.motherboard.Motherboard;
import com.dmitry.tkachenko.spring.computer.component.cpu.CPU;
import com.dmitry.tkachenko.spring.computer.component.graphics.Graphics;
import com.dmitry.tkachenko.spring.computer.component.ram.RAM;
import com.dmitry.tkachenko.spring.computer.component.storage.Storage;

/**
 * Created by dmitry tkachenko on 1/6/17.
 */
public class DellAlienwarePC implements Case {
    private Motherboard motherboard;
    private CPU cpu;
    private Graphics graphics;
    private RAM ram;
    private Storage storage;

    public DellAlienwarePC() {
    }

    public DellAlienwarePC(Motherboard motherboard, CPU cpu, Graphics graphics, RAM ram, Storage storage) {
        super();
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.graphics = graphics;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public void turnOn() {
        System.out.println("loading...");
    }

    @Override
    public void turnOff() {
        System.out.println("shutdown");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("\nMotherboard: %s\n", motherboard.info()));
        sb.append(String.format("CPU: %s\n", cpu.info()));
        sb.append(String.format("Graphics: %s\n", graphics.info()));
        sb.append(String.format("RAM: %s\n", ram.info()));
        sb.append(String.format("Storage: %s\n", storage.info()));

        return sb.toString();
    }
}
