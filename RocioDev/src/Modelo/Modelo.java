package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Modelo {
    private Connection connection;

    public Modelo(String url, String usuario, String password) throws SQLException {
        connection = DriverManager.getConnection(url, usuario, password);
    }

    public void insertarDatos(String nombre, int tiempo_de_preparacion, double precio) throws SQLException {
    	String selectQuery = "SELECT COUNT(nombre) AS count FROM registro WHERE nombre=?";
        PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
        selectStatement.setString(1, nombre);
        ResultSet rs = selectStatement.executeQuery();
        rs.next();
        int count = rs.getInt("count");
        selectStatement.close();

        if (count > 0) {
            System.out.println("El plato ya existe en la base de datos.");
        } else {
            String insertQuery = "INSERT INTO registro(nombre, tiempo_de_preparacion, precio) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, nombre);
            insertStatement.setInt(2, tiempo_de_preparacion);
            insertStatement.setDouble(3, precio);
            insertStatement.executeUpdate();
            insertStatement.close();
            System.out.println("Plato agregado correctamente.");
        }
    }


}