package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.Controlador;

public class Vistaa extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNombre;
    private JTextField txtTiempoDePreparacion;
    private JTextField txtPrecio;
    private JButton btnAgregar;

    public Vistaa() {
        super("Agregar Plato");

        JPanel panelCampos = new JPanel(new FlowLayout());
        panelCampos.add(new JLabel("Nombre: "));
        txtNombre = new JTextField(10);
        panelCampos.add(txtNombre);
        panelCampos.add(new JLabel("Tiempo: "));
        txtTiempoDePreparacion = new JTextField(10);
        panelCampos.add(txtTiempoDePreparacion);
        panelCampos.add(new JLabel("Costo: "));
        txtPrecio = new JTextField(10);
        panelCampos.add(txtPrecio);

        btnAgregar = new JButton("Agregar");
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBoton.add(btnAgregar);

        getContentPane().add(panelCampos, BorderLayout.CENTER);
        getContentPane().add(panelBoton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public int getTiempoDePreparacion() {
        return Integer.parseInt(txtTiempoDePreparacion.getText());
    }

    public double getPrecio() {
        return Double.parseDouble(txtPrecio.getText());
    }

    public void agregarListener(Controlador controlador) {
        btnAgregar.addActionListener((ActionListener) controlador);
    }
}