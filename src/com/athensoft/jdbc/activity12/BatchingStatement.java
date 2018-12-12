package com.athensoft.jdbc.activity12;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchingStatement {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{

            // Open a connection
            System.out.println("Connecting to database...");
            conn = ConnectionUtil.getConnection();

            // Create statement
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Set auto-commit to false
            conn.setAutoCommit(false);

            // First, let us select all the records and display them.
            printRows( stmt );

            // Create SQL statement
            String SQL = "INSERT INTO Employees (id, first, last, age) " +
                    "VALUES(200,'Zia', 'Ali', 30)";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create one more SQL statement
            SQL = "INSERT INTO Employees (id, first, last, age) " +
                    "VALUES(201,'Raj', 'Kumar', 35)";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create one more SQL statement
            SQL = "UPDATE Employees SET age = 35 " +
                    "WHERE id = 100";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create an int[] to hold returned values
            int[] count = stmt.executeBatch();

            //Explicitly commit statements to apply changes
            conn.commit();

            // Again, let us select all the records and display them.
            printRows( stmt );

            // Clean-up environment
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

    public static void printRows(Statement stmt) throws SQLException{
        System.out.println("Displaying available rows...");
        // Let us select all the records and display them.
        String sql = "SELECT id, first, last, age FROM Employees";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
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
        System.out.println();
        rs.close();
    }//end printRows()

}
