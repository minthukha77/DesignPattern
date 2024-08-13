package com.mtk.designpattern.AbstarctFactoryDesignPattern.AwtFactory;

import com.mtk.designpattern.AbstarctFactoryDesignPattern.Button;
import com.mtk.designpattern.AbstarctFactoryDesignPattern.Combobox;
import com.mtk.designpattern.AbstarctFactoryDesignPattern.Label;
import com.mtk.designpattern.AbstarctFactoryDesignPattern.UIAbstractFactory;

public class AwtFactory implements UIAbstractFactory {

    @Override
    public Button createButton() {
        return new AwtButton();
    }

    @Override
    public Label createLabel() {
        return new AwtLabel();
    }

    @Override
    public Combobox createComboBox() {
        return new AwtCombobox();
    }

   
    
}
