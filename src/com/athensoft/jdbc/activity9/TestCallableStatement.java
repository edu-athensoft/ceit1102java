package com.athensoft.jdbc.activity9;

import java.sql.*;

public class TestCallableStatement {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";

    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "Timon@927";

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating callable statement...");

            String sql;
            sql = "{call getFirstName(?,?)}";
            cstmt = conn.prepareCall(sql);
            int index_1 = 1;
            int value_1 = 1;
            cstmt.setInt(index_1,value_1);

            cstmt.execute();

            //STEP 5: Extract data from result set
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
