package com.mtk.designpattern.FactoryMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create a MySQL connection using the factory method
        FactoryAbstract mySQLFactory = new MySQLConnectionFactory();
        mySQLFactory.connectToDatabase();

        // Create an Oracle connection using the factory method
        FactoryAbstract oracleFactory = new OracleConnectionFactory();
        oracleFactory.connectToDatabase();

        // Create a PostgreSQL connection using the factory method
        FactoryAbstract postgreSQLFactory = new PostgreSQLConnectionFactory();
        postgreSQLFactory.connectToDatabase();

        // Create a DynamoDB connection using the factory method
        FactoryAbstract dynamoFactory = new DynamoDBConnectionFactory();
        dynamoFactory.connectToDatabase();
    }
}
