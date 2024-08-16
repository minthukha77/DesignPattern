package com.mtk.designpattern.DecoratorDesignPattern;

public class HTMLDecorator implements Logger {

    Logger logger;

    public HTMLDecorator(Logger logger)
    {
        this.logger = logger;
    }

    @Override
    public String log(String message) {
        return "<html>"+logger.log(message)+"</html>";
    }
    
}
