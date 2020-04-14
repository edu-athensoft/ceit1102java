package com.athensoft.jdbc.activity10;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaction {
    public static final void main(String[] args){
        Connection conn = null;

        try{
            conn = ConnectionUtil.getConnection();

            //Assume a valid connection object conn
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

//            String sql = "INSERT INTO Employees VALUES (106, 20, 'Rita', 'Tez')";
            String sql = "INSERT INTO Job(JobDesc) VALUES ('Jobdesc-f')";
            stmt.executeUpdate(sql);
            
            //Submit a malformed SQL statement that breaks
//            String sql2 = "INSERTED IN Employees VALUES (107, 22, 'Sita', 'Singh')";  //try it first
//            String sql2 = "INSERT INTO Employees VALUES (107, 22, 'Sita', 'Singh')";    //try it after
            
            
//            String sql2 = "INSERTED INTO Job(JobDesc) VALUES ('Jobdesc-d')";	//try it first
          String sql2 = "INSERT INTO Job(JobDesc) VALUES ('Jobdesc-abg')";	//try it after
            stmt.executeUpdate(sql2);
            // If there is no error.
            conn.commit();

        }catch(SQLException se){
            // If there is any error.
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
