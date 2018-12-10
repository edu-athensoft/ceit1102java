package com.athensoft.jdbc.activity8;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnectionWithPropDoc {

    private static String driverName;
    private static String url;
    private static String user;
    private static String password;


    public static void main(String[] args) {
        InputStream inStream = TestConnectionWithPropDoc.class.getClassLoader().getResourceAsStream("jdbc-mysql.properties");

        Properties prop = new Properties();

        Connection conn = null;
        try {
            prop.load(inStream);

            driverName = prop.getProperty("driverName");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");

            Class.forName(driverName);
            conn = DriverManager.getConnection(url, user, password);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
