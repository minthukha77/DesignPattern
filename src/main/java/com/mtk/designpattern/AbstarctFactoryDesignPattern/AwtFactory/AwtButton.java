package com.mtk.designpattern.AbstarctFactoryDesignPattern.AwtFactory;

import com.mtk.designpattern.AbstarctFactoryDesignPattern.Button;

public class AwtButton extends Button {
    public void paint(){
        System.out.println("AwtButton");
    }
}
