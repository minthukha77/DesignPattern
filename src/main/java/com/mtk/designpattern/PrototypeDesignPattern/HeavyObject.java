package com.mtk.designpattern.PrototypeDesignPattern;

public class HeavyObject implements Prototype{
    String propertyGetFromDB;
    String computationalHungryProperty;
    
    static String getPropertyFromDB() {
        return "PropertyFromDb"; //Here assume call to db to simulate costly memory 
    }
    
    static String getCompuationalHungryProperty() {
        return "ComputationHungryProperty";//Here assume call to costly computation time 
    }
    
    public HeavyObject() {
        this.propertyGetFromDB = HeavyObject.getPropertyFromDB(); 
        this.computationalHungryProperty = HeavyObject.getCompuationalHungryProperty(); 
    }
    
    @Override
    public HeavyObject reproduce() { 
        try {
             Prototype cop = (Prototype)super.clone();//Here call lang.lang.Object.clone 
             HeavyObject newObject = (HeavyObject)cop;
             return newObject;
        } catch (CloneNotSupportedException ex) { 
            ex.printStackTrace();
    }

    return null;

    } 
    
    @Override
    public String toString() {
        return "HeavyObject{" + "propertyGetFromDB=" + propertyGetFromDB + ", computationalHungryProperty=" + computationalHungryProperty + '}';
    } 

}