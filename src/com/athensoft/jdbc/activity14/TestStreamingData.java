package com.athensoft.jdbc.activity14;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

public class TestStreamingData {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{


            // Open a connection
            System.out.println("Connecting to database...");
            conn = ConnectionUtil.getConnection();

            //Create a Statement object and build table
            stmt = conn.createStatement();
            createXMLTable(stmt);

            //Open a FileInputStream
//            File f = new File("D:\\java\\workspace\\ideaws\\ceit1102java\\src\\com\\athensoft\\jdbc\\activity14\\XML_Data");
            File f = new File("D:\\workspace\\eclipse201812\\ws_learning\\ceit1102java\\src\\com\\athensoft\\jdbc\\activity14\\XML_Data");
            
            long fileLength = f.length();
            FileInputStream fis = new FileInputStream(f);

            //Create PreparedStatement and stream data
            String SQL = "INSERT INTO xml_data(id,data) VALUES (?,?)";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1,100);
            pstmt.setAsciiStream(2,fis,(int)fileLength);
            pstmt.execute();

            //Close input stream
            fis.close();

            // Do a query to get the row
            SQL = "SELECT Data FROM xml_data WHERE id=100";
            rs = stmt.executeQuery (SQL);
            // Get the first row
            if (rs.next ()){
                //Retrieve data from input stream
                InputStream xmlInputStream = rs.getAsciiStream (1);
                int c;
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                while (( c = xmlInputStream.read ()) != -1)
                    bos.write(c);
                //Print results
                System.out.println(bos.toString());
            }
            // Clean-up environment
            rs.close();
            stmt.close();
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
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(pstmt!=null)
                    pstmt.close();
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

    public static void createXMLTable(Statement stmt)
            throws SQLException{
        System.out.println("Creating XML_Data table..." );
        //Create SQL Statement
        String streamingDataSql = "CREATE TABLE xml_data " +
                "(uid INTEGER NOT NULL AUTO_INCREMENT, id INTEGER, Data mediumtext, PRIMARY KEY (uid))";
        //Drop table first if it exists.
        try{
            stmt.executeUpdate("DROP TABLE xml_data");
        }catch(SQLException se){
        }// do nothing
        //Build table.
        stmt.executeUpdate(streamingDataSql);
    }//end createXMLTable

}
