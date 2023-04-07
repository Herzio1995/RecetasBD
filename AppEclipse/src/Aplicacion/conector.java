package Aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conector {

	String bd = "userstoriesappdb";
	String url = "jdbc:mysql://localhost:3306/";
	String user = "root";
	String password = "";
	String driver = "com.mysql.cj.jdbc.Driver";

	Connection cx;

	public Connection conectar() {
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url + bd, user, password);
			System.out.println("Se ha conectado a la base de datos " + bd);
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("No se ha conectado a la base de datos " + bd);
			Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
		}
		return cx;
	}

	public void desconectar() {
		try {
			cx.close();
		} catch (SQLException ex) {
			Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void main(String[] args) {
		conector conexion = new conector();
		conexion.conectar();
	}
}
