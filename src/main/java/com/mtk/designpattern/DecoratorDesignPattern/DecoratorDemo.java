package com.mtk.designpattern.DecoratorDesignPattern;

public class DecoratorDemo {

    public static void main(String[] args) {
        Logger logger = new BasicLogger();

        Logger decorator = new HTMLDecorator(new TimeDecorator(logger));
        System.out.println(decorator.log("log message1"));
        decorator = new TimeDecorator(logger);
        System.out.println(decorator.log("log message2"));

    }
    
}
