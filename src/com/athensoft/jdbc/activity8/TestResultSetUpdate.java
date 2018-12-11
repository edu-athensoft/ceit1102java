package com.athensoft.jdbc.activity8;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.*;

public class TestResultSetUpdate {


    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
            //Open a connection
            System.out.println("Connecting to database...");
            conn = ConnectionUtil.getConnection();

            //Execute a query to create statment with
            // required arguments for RS example.
            System.out.println("Creating statement...");
            stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            //Execute a query
            String sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("List result set for reference....");
            printRs(rs);

            //Loop through result set and add 5 in age
            //Move to BFR postion so while-loop works properly
            rs.beforeFirst();

            //Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int newAge = rs.getInt("age") + 5;
                rs.updateDouble( "age", newAge );
                rs.updateRow();
            }
            System.out.println("List result set showing new ages...");
            printRs(rs);


            // Insert a record into the table.
            //Move to insert row and add column data with updateXXX()
            System.out.println("Inserting a new record...");
            rs.moveToInsertRow();
            rs.updateInt("id",104);
            rs.updateString("first","John");
            rs.updateString("last","Paul");
            rs.updateInt("age",40);
            //Commit row
            rs.insertRow();

            System.out.println("List result set showing new set...");
            printRs(rs);

            // Delete second record from the table.
            // Set position to second record first
            rs.absolute( 2 );
            System.out.println("List the record before deleting...");
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

            //Delete row
            rs.deleteRow();
            System.out.println("List result set after deleting one records...");
            printRs(rs);

            //STEP 8: Clean-up environment
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
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main

    public static void printRs(ResultSet rs) throws SQLException{
        //Ensure we start with first row
        rs.beforeFirst();
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
    }//end printRs()
}
