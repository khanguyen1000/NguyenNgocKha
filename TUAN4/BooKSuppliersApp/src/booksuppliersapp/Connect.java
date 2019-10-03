/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksuppliersapp;
import java.sql.*;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author KHA
 */
public class Connect {
    Connection conn=null;
    
    public Connection getConnectDB(){
  
             String url="",user="", password="";
        url="jdbc:jtds:sqlserver://localhost:1433/dbBookSuppliers";
        String sql="";
        user="sa";
        password="123";
        conn=DriverManager.getConnection(url, user, password);    
       
}
}
