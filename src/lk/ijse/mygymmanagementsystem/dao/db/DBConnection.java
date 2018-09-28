/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mygymmanagementsystem.dao.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chinthaka
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection(){
        
        try {
            
            Properties dbProperties = new Properties();
            File dbFile = new File("setting/dbProperties.properties");
            FileReader dbReader = new FileReader(dbFile);
            dbProperties.load(dbReader);
            
            String ip = dbProperties.getProperty("ip");
            String port = dbProperties.getProperty("port");
            String database = dbProperties.getProperty("database");
            String username = dbProperties.getProperty("username");
            String password = dbProperties.getProperty("password");
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://" + ip + ":" + port + "/" + database;
            
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DBConnection getInstance(){
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
