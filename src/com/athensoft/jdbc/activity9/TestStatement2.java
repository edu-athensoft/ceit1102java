package com.athensoft.jdbc.activity9;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.*;

/**
 * Activity 9-1b. how to use PreparedStatement
 */
public class TestStatement2 {

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
            sql = "UPDATE customer SET first_name = 'MARY_new', last_name= 'SMITH_new' WHERE customer_id=1";

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
