package com.athensoft.jdbc.activity7;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.*;

/**
 * Activity 9-2. How to use PreparedStatement
 */
public class TestPrepStatement {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            //Open a connection
            System.out.println("Connecting to database...");
            conn = ConnectionUtil.getConnection();

            //Execute a query
            System.out.println("Creating prepared statement...");

            String sql;
            sql = "SELECT customer_id, store_id, first_name, last_name FROM customer WHERE customer_id=?";
            pstmt = conn.prepareStatement(sql);
            int index_1 = 1;
            int value_1 = 1;
            pstmt.setInt(index_1,value_1);

            ResultSet rs = pstmt.executeQuery();

            //Extract data from result set
            showResult(rs);

            /* Clean-up environment */
            rs.close();
            pstmt.close();
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
                if(pstmt!=null)
                    pstmt.close();
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
