/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javasqlserver;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yesica Sanchez
 */
public class CPlatos {
    
    public void mostrarPlatos(JTable paramTablaPlatos){
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql ="";
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("precio");
        modelo.addColumn("tiempo");
        
        paramTablaPlatos.setModel(modelo);
        
        
        sql = "select * from platos;";
        //sql = "select distinct codigo,nombre ,precio, tiempo from platos;";
        String [] datos = new String[4];
        Statement st;
        try{
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4); 
                
                modelo.addRow(datos);
            }
            
            paramTablaPlatos.setModel(modelo);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se mostraron los registros, error:"+e.toString());
        }
        
    }
    
    public void SeleccionarPlatos(JTable paramTablaPlatos, JTextField paramCodigo,JTextField paramNombre,JTextField paramPrecio,JTextField paramTiempo){
        try{
            int fila = paramTablaPlatos.getSelectedRow();
            if(fila >= 0){
                paramCodigo.setText(paramTablaPlatos.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaPlatos.getValueAt(fila, 1).toString());
                paramPrecio.setText(paramTablaPlatos.getValueAt(fila, 2).toString());
                paramTiempo.setText(paramTablaPlatos.getValueAt(fila, 3).toString());
            }else{
                JOptionPane.showMessageDialog(null, "No se selecciono  registros, error:");
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de seleccion, error:"+e.toString());
        }
    }
    
    public void InsertarPlatos(JTextField paramNombre,JTextField paramPrecio,JTextField paramTiempo){
        CConexion objetoConexion = new CConexion();
        String consulta = "insert into platos (nombre,precio,tiempo)values(?,?,?);";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setString(1, paramNombre.getText());
            cs.setInt(2,Integer.parseInt(paramPrecio.getText()));
            cs.setInt(3,Integer.parseInt(paramTiempo.getText()));
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el plato");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de insercion, error:"+e.toString());
        }
    }
    
    public void ModificarPlatos(JTextField paramCodigo,JTextField paramNombre,JTextField paramPrecio,JTextField paramTiempo){
        CConexion objetoConexion = new CConexion();
        String consulta = "UPDATE platos SET platos.nombre = ?, platos.precio=?, platos.tiempo=? WHERE platos.codigo=?;";
        
        try{
             CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
             
             cs.setString(1, paramNombre.getText());
             cs.setInt(2,Integer.parseInt(paramPrecio.getText()));
             cs.setInt(3,Integer.parseInt(paramTiempo.getText()));
             cs.setInt(4,Integer.parseInt(paramCodigo.getText()));
            
            cs.execute();
             JOptionPane.showMessageDialog(null, "Se modifico correctamente el plato");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de modificacion, error:"+e.toString());
        }
        
    }
    
    public void EliminarPlatos(JTextField paramCodigo){
        CConexion objetoConexion = new CConexion();
        String consulta ="DELETE FROM platos WHERE platos.codigo = ?;";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1,Integer.parseInt(paramCodigo.getText()));
            cs.execute();
             JOptionPane.showMessageDialog(null, "Se elimino correctamente el plato");
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error de eliminacion, error:"+e.toString());
        }
    }
}
