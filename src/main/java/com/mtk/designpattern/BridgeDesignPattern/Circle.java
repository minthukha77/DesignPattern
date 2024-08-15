package com.mtk.designpattern.BridgeDesignPattern;

public class Circle extends Shape {

    public Circle(DrawingApi api){
        super(api);
    }

    @Override
    void draw() {
        this.api.drawCircle();
    }
    
}
