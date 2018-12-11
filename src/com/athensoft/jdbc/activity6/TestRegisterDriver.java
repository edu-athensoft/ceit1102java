package com.athensoft.jdbc.activity6;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Activity 6-2 Register JDBC Driver, Approach II
 */
public class TestRegisterDriver {

    private static final String DB_URL = "jdbc:mysql://workstation:3306/ceit1102java";

    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "Timon@927";

    public static void main(String[] args) {

        Connection conn = null;

        try {
            // load driver
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);

            //create connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //test connection
            System.out.println("The connection object is: "+conn);
            if(conn==null){
                System.out.println("Error: Connection creating failed!");
            }else{
                System.out.println("Info: Connection created.");
            }


        }
        catch (SQLException e) {
            System.out.println("Error: unable to load driver class!");
            e.printStackTrace();
            System.exit(1);
        }finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
