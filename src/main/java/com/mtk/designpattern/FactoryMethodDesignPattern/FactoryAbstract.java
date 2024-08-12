package com.mtk.designpattern.FactoryMethodDesignPattern;

abstract class FactoryAbstract {
    // Factory Method
    public abstract ConnectionInterface createConnection();

    public void connectToDatabase() {
        ConnectionInterface connection = createConnection();
        connection.connect();
    }
}

