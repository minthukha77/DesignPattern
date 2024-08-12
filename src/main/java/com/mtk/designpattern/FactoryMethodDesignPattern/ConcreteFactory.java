package com.mtk.designpattern.FactoryMethodDesignPattern;

class MySQLConnectionFactory extends FactoryAbstract {
    @Override
    public ConnectionInterface createConnection() {
        return new MySQLConnection();
    }
}

class OracleConnectionFactory extends FactoryAbstract {
    @Override
    public ConnectionInterface createConnection() {
        return new OracleConnection();
    }
}

class PostgreSQLConnectionFactory extends FactoryAbstract {
    @Override
    public ConnectionInterface createConnection() {
        return new PostgreSQLConnection();
    }
}

class DynamoDBConnectionFactory extends FactoryAbstract{

    @Override
    public ConnectionInterface createConnection() {
        return new DynamoDBConnection();
    }
    
}
