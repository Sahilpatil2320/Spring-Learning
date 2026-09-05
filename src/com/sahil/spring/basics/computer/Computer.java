package com.sahil.spring.basics.computer;

public class Computer {
    private Processor processor;
    public  Computer(){
        processor = new Processor();
    }
    public void run(){
        processor.start();
        System.out.println("Computer is running..");
    }
}
