/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seznam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class VytvorimeDatabazi {
    // JDBC driver name and database URL 
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String DB_URL = "jdbc:derby://localhost:1527/ONLINEOBCHOD";
    // Database credentials 
    private static final String USER = "dnadler";
    private static final String PASS = "nadlerka"; 
    private static Connection conn = null;
    private static Statement stmt = null;
    public static ResultSet vratHodnotu(String sql) throws SQLException,Exception
    {
    //STEP 2: Register JDBC driver 
    Class.forName(JDBC_DRIVER);
    //STEP 3: Open a connection 
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    //STEP 4: Execute a query 
    System.out.println("Creating statement..."); 
    stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    return rs;
    }
    }

