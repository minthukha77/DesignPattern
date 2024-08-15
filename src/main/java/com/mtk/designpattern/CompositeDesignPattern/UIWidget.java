package com.mtk.designpattern.CompositeDesignPattern;

public abstract class UIWidget {

    String id;

    UIWidget(String id){
        this.id = id;
    }
    abstract void draw();
    
}
