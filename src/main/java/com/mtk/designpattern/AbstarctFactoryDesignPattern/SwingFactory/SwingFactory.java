package com.mtk.designpattern.AbstarctFactoryDesignPattern.SwingFactory;

import com.mtk.designpattern.AbstarctFactoryDesignPattern.Button;
import com.mtk.designpattern.AbstarctFactoryDesignPattern.Combobox;
import com.mtk.designpattern.AbstarctFactoryDesignPattern.Label;
import com.mtk.designpattern.AbstarctFactoryDesignPattern.UIAbstractFactory;

public class SwingFactory implements UIAbstractFactory {

    @Override
    public Button createButton() {
        return new SwingButton();
    }

    @Override
    public Label createLabel() {
        return new SwingLabel();
    }

    @Override
    public Combobox createComboBox() {
       return new Combobox();
    }
    
}
