package com.mtk.designpattern.CompositeDesignPattern;

public class View extends UIWidget {

    public View(String id) {
        super(id);
    }

    @Override
    void draw() {
        System.out.println("Draw View "+ this.id);
    }
    
}
