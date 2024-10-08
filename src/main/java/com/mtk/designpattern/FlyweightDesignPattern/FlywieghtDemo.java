package com.mtk.designpattern.FlyweightDesignPattern;

public class FlywieghtDemo {
    
    public static void main(String[] args) {
        Code javaCode = new Code("Java program");
        Code dotNetCode = new Code("C#Program");
        
        Platform p = PlatformFactory.getInstance(".NET");
        p.execute(dotNetCode);
        
        Platform java = PlatformFactory.getInstance("JAVA");
        java.execute(javaCode);
        
        java = PlatformFactory.getInstance("JAVA");
        java.execute(javaCode);
        
        
        p = PlatformFactory.getInstance(".NET");
        p.execute(dotNetCode);
    }
}