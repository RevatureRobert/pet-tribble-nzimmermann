package com.challenge.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {


    private static ConnectionUtil instance;

    private ConnectionUtil(){}

    public static ConnectionUtil getInstance(){
        if(instance == null){
            instance = new ConnectionUtil();
        }
        return instance;
    }


    public Connection getConnection() throws SQLException {
        //System.out.println("attempting connection now");
        return DriverManager.getConnection(
                "jdbc:postgresql://proj0psql.cedyr7myrak1.us-west-2.rds.amazonaws.com:5432/postgres?currentSchema=tribble",
                "db_manager",
                "password");
    }


}
