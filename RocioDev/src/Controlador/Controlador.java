package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.agregarListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            modelo.insertarDatos(vista.getNombre(), vista.getTiempoDePreparacion(), vista.getPrecio());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}