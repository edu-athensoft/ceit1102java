package com.athensoft.jdbc.activity10;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.*;

public class TestResultSet {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //Open a connection
            System.out.println("Connecting to database...");
            conn = ConnectionUtil.getConnection();

            //Execute a query to create statement with required arguments for RS example.
            System.out.println("Creating statement...");
            stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            //Move cursor to the last row.
            System.out.println("Moving cursor to the last...");
            rs.last();
            //Extract data from result set
            System.out.println("Displaying record...");
            showRecord(rs);
            System.out.println();

            // Move cursor to the first row.
            System.out.println("Moving cursor to the first row...");
            rs.first();
            //Extract data from result set
            System.out.println("Displaying record...");
            showRecord(rs);
            System.out.println();


            // Move cursor to the nex row.
            System.out.println("Moving cursor to the next row...");
            rs.next();
            //Extract data from result set
            System.out.println("Displaying record...");
            showRecord(rs);
            System.out.println();


            //Clean-up environment
            rs.close();
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

    public static void showRecord(ResultSet rs) throws SQLException {
        //Retrieve by column name
        int id  = rs.getInt("id");
        int age = rs.getInt("age");
        String first = rs.getString("first");
        String last = rs.getString("last");

        //Display values
        System.out.print("ID: " + id);
        System.out.print(", Age: " + age);
        System.out.print(", First: " + first);
        System.out.println(", Last: " + last);
    }
}
