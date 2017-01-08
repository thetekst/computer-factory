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

    public void initObj() {
        System.out.println("init object");
    }

    public void destroyObj() {
        System.out.println("destroy object");
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

        return String.format("\nMotherboard: %s\n", motherboard.info()) +
                String.format("CPU: %s\n", cpu.info()) +
                String.format("Graphics: %s\n", graphics.info()) +
                String.format("RAM: %s\n", ram.info()) +
                String.format("Storage: %s\n", storage.info());
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
