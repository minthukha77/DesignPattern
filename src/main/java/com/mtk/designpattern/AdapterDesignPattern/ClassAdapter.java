package com.mtk.designpattern.AdapterDesignPattern;

public class ClassAdapter extends OldApi implements NewApi{

    @Override
    public void add(int item) {
       super.push(item);
    }

    public static void main(String[] args) {
        NewApi api = new ClassAdapter();
        api.add(100);
    }
    
}
