package com.athensoft.jdbc.activity6;

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
        try {

            InputStream inStream = TestConnectionWithPropDoc.class.getResourceAsStream("../config/jdbc-mysql.properties");


//            File file = new File("D:\\java\\workspace\\ideaws\\ceit1102java\\src\\com\\athensoft\\jdbc\\activity8\\jdbc-mysql.properties");
//            InputStream inStream = new FileInputStream(file);
            Properties prop = new Properties();

            Connection conn = null;

                if (inStream == null) {
                    System.out.println("instream is null");
                } else {
                    System.out.println(inStream);
                    prop.load(inStream);
                }


                driverName = prop.getProperty("driverName");
                url = prop.getProperty("url");
                user = prop.getProperty("user");
                password = prop.getProperty("password");

                System.out.println(driverName);
                System.out.println(url);
                System.out.println(user);
                System.out.println(password);

                Class.forName(driverName);
                conn = DriverManager.getConnection(url, user, password);
                
                System.out.println("The connection is:"+conn);
                

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

