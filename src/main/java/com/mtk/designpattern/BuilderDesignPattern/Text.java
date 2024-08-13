package com.mtk.designpattern.BuilderDesignPattern;

import java.lang.module.ModuleDescriptor.Builder;

public class Text {

    String displayValue;
    String font;
    String color;
    String decoration;

    private Text(Builder builder){
        this.displayValue = builder.displayValue;
        this.font = builder.font;
        this.color = builder.color;
        this.decoration = builder.decoration;

    }

    static class Builder
    {
        String displayValue;
        String font;
        String color;
        String decoration;

        Builder displayValue(String dValue){
            this.displayValue = dValue;
            return this;
        }
        Builder font(String font){
            this.font = font;
            return this;
        }
        Builder color(String color){
            this.color = color;
            return this;
        }
        Builder decoration(String decoration){
            this.decoration = decoration;
            return this;
        }
        Text Build(){
            Text text = new Text(this);
            return text;
        }
    }

    @Override
    public String toString() {
        return "Text [displayValue=" + displayValue + ", font=" + font + ", color=" + color + ", decoration="
                + decoration + "]";
    }


    public static void main(String[] args) {
        Text text = new Text.Builder()
                        .displayValue("Hello")
                       // .decoration("bold")
                       // .color("green")
                        .font("Roman")
                        .Build();

        System.out.println("Text" +text);

    }

    
    
}
