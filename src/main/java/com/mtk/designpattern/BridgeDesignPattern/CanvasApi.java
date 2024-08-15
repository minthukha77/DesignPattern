package com.mtk.designpattern.BridgeDesignPattern;

public class CanvasApi implements DrawingApi {

    @Override
    public void drawCircle() {
       System.out.println("Draw Canvas Circle");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Draw Canvas Rectangle");

    }
    
}
