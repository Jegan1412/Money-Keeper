/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import javax.swing.JOptionPane;

public class database_connect {
    public static Connection c;
    public static Statement s;
    static{
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/expendituredb"+"?useSSL=FALSE", "root" ,"1412");
            s = c.createStatement();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
