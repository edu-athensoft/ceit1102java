package com.athensoft.jdbc.activity12;

import com.athensoft.jdbc.base.ConnectionUtil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * Activity 12. Test if database support Batch Updating
 */
public class TestBatchSupport {
    public static void main(String[] args) {
        Connection conn = null;
        DatabaseMetaData md = null;
        try {
            conn = ConnectionUtil.getConnection();
            md = conn.getMetaData();
            final boolean isSupporting = md.supportsBatchUpdates();
            System.out.println("My database supports Batch Updating : "+isSupporting);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
