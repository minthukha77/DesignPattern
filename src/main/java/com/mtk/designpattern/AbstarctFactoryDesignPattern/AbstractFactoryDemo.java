package com.mtk.designpattern.AbstarctFactoryDesignPattern;

import com.mtk.designpattern.AbstarctFactoryDesignPattern.SwingFactory.SwingFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIAbstractFactory factory = new SwingFactory();
        Button button = factory.createButton();
        Label label = factory.createLabel();
        Combobox combobox = factory.createComboBox();

        button.draw();
        label.draw();
        combobox.draw();

    }
}
