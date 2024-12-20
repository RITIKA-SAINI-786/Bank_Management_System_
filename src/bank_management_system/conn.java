/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management_system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conn{
   Connection c;
   Statement s;
    
   public conn(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Qwerty123!");   
           s= c.createStatement();
       }
       catch(Exception ex){
           Logger.getLogger(conn.class.getName()).log(Level.SEVERE,null,ex);
       }
   }

}

/**
 *
 * @author HP
 */
