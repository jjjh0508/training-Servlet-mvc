package com.jihwan.mara.common.jdbc;

import com.jihwan.mara.common.config.ConfigLocation;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {
    public static Connection getConnection() {
        Connection con = null;
        Properties prop = new Properties();

        try {
            prop.load(new FileReader(ConfigLocation.CONNECTION_CONFIG_LOCATION));
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            Class.forName(driver);
            con = DriverManager.getConnection(url, prop);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;

    }

    public static void close(Statement stmt) {


        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void close(Connection con) {


        try {
            if (con != null && !con.isClosed()) {
                con.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void close(ResultSet set) {


        try {
            if (set != null && !set.isClosed()) {
                set.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void commit(Connection connection) {
        try {
            if (connection != null && connection.isClosed()) {
                connection.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
