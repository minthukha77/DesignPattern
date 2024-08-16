package com.mtk.designpattern.ObserverDesignPattern;

public class View implements Subscriber{

    String name;
    View(String name)
    {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("Vie "+this.name+ "update with message "+message);
    }
    
}
