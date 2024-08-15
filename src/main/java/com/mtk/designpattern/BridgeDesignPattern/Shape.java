package com.mtk.designpattern.BridgeDesignPattern;

public abstract class Shape {
    DrawingApi api;

    Shape(DrawingApi api){
        this.api = api;
    }

    abstract void draw();
}
