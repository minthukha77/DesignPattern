package com.mtk.designpattern.FactoryMethodDesignPattern;

class MySQLConnection implements ConnectionInterface {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
}

class OracleConnection implements ConnectionInterface {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }
}

class PostgreSQLConnection implements ConnectionInterface {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Database...");
    }
}

class DynamoDBConnection implements ConnectionInterface{

    @Override
    public void connect() {
        System.out.println("Connecting to DynamoDB Database...");

    }
    
}

