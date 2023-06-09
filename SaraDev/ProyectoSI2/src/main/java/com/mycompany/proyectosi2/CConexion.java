/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosi2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP VICTUS
 */
public class CConexion {
    private Connection conectar = null; 
    
    String usuario ="";
    String contrasenia ="";
    String bd ="";
    String ip ="";
    String puerto ="1433";
    
    public Connection establecerConexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String cadena ="jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"+
                             "encrypt=true;trustServerCertificate=true";
            setConectar(DriverManager.getConnection(cadena,usuario,contrasenia));
            JOptionPane.showMessageDialog(null,"Conecto");
        }catch (Exception e){
             JOptionPane.showMessageDialog(null,"No se conecto");
        }
        return getConectar();
    }

    /**
     * @return the conectar
     */
    public Connection getConectar() {
        return conectar;
    }

    /**
     * @param conectar the conectar to set
     */
    public void setConectar(Connection conectar) {
        this.conectar = conectar;
    }
}
