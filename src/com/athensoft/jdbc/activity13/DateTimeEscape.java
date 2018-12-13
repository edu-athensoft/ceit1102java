package com.athensoft.jdbc.activity13;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Activity 13. SQL Escape Syntax
 */
public class DateTimeEscape {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //Open a connection
            conn = ConnectionUtil.getConnection();

            //Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            //Insert data ==> ID, First Name, Last Name, DOB
//            sql = "INSERT INTO testdatetime VALUES" +
//                    "(100,'Zara', {d '2001-12-16'})";
            //truncate the table before running following
            sql = "INSERT INTO testdatetime VALUES" +
                    "(101,'Mira', {ts '2001-12-16 11:11:11'})";
            System.out.println("Executing statement...");
            stmt.execute(sql);
            System.out.println("Done.");

            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
                se2.printStackTrace();
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}

