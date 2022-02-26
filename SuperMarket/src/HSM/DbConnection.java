/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HSM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Samila
 */
public class DbConnection {
    Connection con=null;
    public static Connection ConnectionDB()
    {
      try{
       Class.forName("org.sqlite.JDBC");
       Connection con=DriverManager.getConnection("jdbc:sqlite:Kena.db");
          System.out.println("Connection Succeeded");
         return con;
      }
      catch(ClassNotFoundException | SQLException e){
         System.out.println("Connection Failed"+e);
         return null;
          }
        
}
}