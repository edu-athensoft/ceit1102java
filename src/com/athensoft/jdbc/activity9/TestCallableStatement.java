package com.athensoft.jdbc.activity9;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.*;

/**
 * Activity 9-3. How to use CallableStatement
 */
public class TestCallableStatement {

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null;
        try{
            //Open a connection
            System.out.println("Connecting to database...");
            conn = ConnectionUtil.getConnection();

            //Execute a query
            System.out.println("Creating callable statement...");

            String sql;
            sql = "{call getFirstName(?,?)}";
            cstmt = conn.prepareCall(sql);
            int index_1 = 1;
            int value_1 = 1;
            cstmt.setInt(index_1,value_1);

            cstmt.execute();

            //Extract data from result set
            String fname = cstmt.getString(2);
            System.out.println(fname);
            cstmt.close();
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
                if(cstmt!=null)
                    cstmt.close();
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
