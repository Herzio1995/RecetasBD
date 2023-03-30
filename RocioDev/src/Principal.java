
import java.sql.SQLException;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Principal {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/registro_db";
        String usuario = "root";
        String password = "";

        Modelo modelo = new Modelo(url, usuario, password);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
    }
}
