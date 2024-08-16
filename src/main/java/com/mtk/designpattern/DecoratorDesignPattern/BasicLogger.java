package com.mtk.designpattern.DecoratorDesignPattern;

public class BasicLogger implements Logger {

    @Override
    public String log(String message) {
       return message;
    }
    
}
