package com.athensoft.jdbc.activity10;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * Activity 11-2 Rollback to SavePoint
 */
public class TestSavePoint {
    public static void main(String[] args) {
        Connection conn = null;

        Savepoint savepoint1 = null;

        try{

            conn = ConnectionUtil.getConnection();

            //Assume a valid connection object conn
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

            //set a Savepoint

            String SQL = "INSERT INTO Employees  VALUES (106, 20, 'Rita', 'Tez')";
            stmt.executeUpdate(SQL);

            conn.commit();
            savepoint1 = conn.setSavepoint("Savepoint1");

            //Submit a malformed SQL statement that breaks
            String SQL2 = "INSERTED IN Employees  VALUES (107, 22, 'Sita', 'Tez')";
            stmt.executeUpdate(SQL2);
            // If there is no error, commit the changes.
            conn.commit();

        }catch(SQLException se){
            // If there is any error.
            try {
                conn.rollback(savepoint1);  //if sql2 failed, rollback to the specified savepoint
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
