package com.mtk.designpattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;
//Real Composite Class
public class ViewGroup extends UIWidget {

    List<UIWidget> children = new ArrayList<UIWidget>();

    public ViewGroup(String id) {
        super(id);
    }

    void addChild(UIWidget child){
        this.children.add(child);
    }

    @Override
    void draw() {
        System.out.println("Draw ViewGroup:" + id);
        for(UIWidget child : this.children){
            child.draw();
        }
    }
    
}
