package com.athensoft.jdbc.activity9;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.*;

/**
 * Activity 9-1a. How to use Statement
 */
public class TestStatement {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //Create a jdbc connection
            conn = ConnectionUtil.getConnection();

            //Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT customer_id, store_id, first_name, last_name FROM customer LIMIT 5";

            //Extract data from result set
            ResultSet rs = stmt.executeQuery(sql);
            showResult(rs);

            //Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main


    public static void showResult(ResultSet rs) throws SQLException {
        while (rs.next()) {
            //Retrieve by column name
            int customer_id = rs.getInt("customer_id");
            int store_id = rs.getInt("store_id");
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");

            //Display values
            System.out.print("customer_id: " + customer_id);
            System.out.print(", store_id: " + store_id);
            System.out.print(", first_name: " + first_name);
            System.out.println(", last_name: " + last_name);
        }
    }

}
