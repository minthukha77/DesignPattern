package com.mtk.designpattern.CompositeDesignPattern;

public class CompositeDemo {
    public static void main(String[] args) {
        ViewGroup main = new ViewGroup("Main Composite");
        View view1 = new View("Child 1");

        main.addChild(view1);
        ViewGroup subView = new ViewGroup("Sub View Composite");

        subView.addChild(new View("level1 child"));
        subView.addChild(new View("level2 child"));

        main.addChild(subView);

        main.draw();
    }
    
}
