package com.mtk.designpattern.BridgeDesignPattern;

public class Rectangle extends Shape {

    public Rectangle(DrawingApi api){
        super(api);
    }

    @Override
    void draw() {
        api.drawRectangle();
    }
    
}
