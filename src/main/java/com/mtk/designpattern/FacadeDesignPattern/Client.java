package com.mtk.designpattern.FacadeDesignPattern;

class Computer
{
    Cpu cpu = new Cpu();
    Memory memory = new Memory();
    HardDisk hd = new HardDisk();
    void start()
    {
        hd.load();
        memory.loadRAM();
        cpu.execute();
    }
}
public class Client {
    public static void main(String[] args) {
        
        Computer computer = new Computer();
        computer.start();
       
    }
}