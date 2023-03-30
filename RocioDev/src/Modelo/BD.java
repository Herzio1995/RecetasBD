package Modelo;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

//clase donde se hara la conexion
public class BD {
	private Connection conexion = null;
	private Statement consulta = null;
	private ResultSet rs = null;
	
	public void Conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3360/registro", "root", "");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "error al cargar la base de datos");
			e.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error al cargar driver");
		}
		
		
	}
	
	public int SetInformacion(String instruccion) {
		Conectar();
		int validar = 0;
		try {
			if(conexion == null) {
				JOptionPane.showMessageDialog(null, "conexion nula");
			}
			consulta = conexion.createStatement();
			validar = consulta.executeUpdate(instruccion);
			return validar;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error al realizar la consulta");
			e.printStackTrace();
			return validar;
		}
	}
}
*/