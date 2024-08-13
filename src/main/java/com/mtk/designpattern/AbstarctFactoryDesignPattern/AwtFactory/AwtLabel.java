package com.mtk.designpattern.AbstarctFactoryDesignPattern.AwtFactory;

import com.mtk.designpattern.AbstarctFactoryDesignPattern.Label;

public class AwtLabel extends Label {
    
    public void paint(){
        System.out.println("AwtLabel");
    }
}
