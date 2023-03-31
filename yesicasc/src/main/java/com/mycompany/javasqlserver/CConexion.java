/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Yesica Sanchez
 */
public class CConexion {
    Connection conectar = null;
    String usuario ="root";
    String contrasenia ="root";
    String bd ="platosDB";
    String ip ="localhost";
    String puerto ="1433";
    
    
    public Connection establecerConexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"+
                            "encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "   no se conecto correctamente");
        }
        return conectar;
    }
}


