/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Winxspace
 */
public class MyDB {
    
    private String url = "jdbc:mysql://localhost/mana";
    private String user = "root";
    private String pass = "";
    private Connection connection;
    static MyDB instance;

  public MyDB(){
        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("connection etablit avec sucess");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static MyDB getInstance(){
        if(instance == null)
            instance = new MyDB();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    
    
}
