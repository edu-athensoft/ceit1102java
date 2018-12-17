package com.athensoft.jdbc.base;

import com.athensoft.jdbc.activity6.TestConnectionWithPropDoc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    public static Connection getConnection() {
        String driverName;
        String url;
        String user;
        String password;

        Connection conn = null;
        try {
            InputStream inStream = ConnectionUtil.class.getResourceAsStream("../config/jdbc-mysql.properties");
            Properties prop = new Properties();
            if (inStream == null) {
                System.out.println("instream is null");
            } else {
//                System.out.println(inStream);
                prop.load(inStream);
            }


            driverName = prop.getProperty("driverName");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");

//            System.out.println(driverName);
//            System.out.println(url);
//            System.out.println(user);
//            System.out.println(password);

            Class.forName(driverName);
            conn = DriverManager.getConnection(url, user, password);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;

    }
}
