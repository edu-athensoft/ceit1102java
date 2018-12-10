package com.athensoft.jdbc.activity9;

import java.sql.*;

public class TestPrepStatement {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ceit1102java";

    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "Timon@927";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating prepared statement...");

            String sql;
            sql = "SELECT customer_id, store_id, first_name, last_name FROM customer WHERE customer_id=?";
            pstmt = conn.prepareStatement(sql);
            int index_1 = 1;
            int value_1 = 1;
            pstmt.setInt(index_1,value_1);

            ResultSet rs = pstmt.executeQuery();

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int customer_id  = rs.getInt("customer_id");
                int store_id = rs.getInt("store_id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");

                //Display values
                System.out.print("customer_id: " + customer_id);
                System.out.print(", store_id: " + store_id);
                System.out.print(", first_name: " + first_name);
                System.out.println(", last_name: " + last_name);
            }
            //STEP 6: Clean-up environment
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
}
