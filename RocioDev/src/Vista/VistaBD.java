package Vista;
/*
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import Controlador.ControlVIstaBD;

public class VistaBD {

	private JFrame frame;
	private JLabel lblNewLabelNombre;
	private JLabel lblNewLabelTiempo;
	private JLabel lblNewLabelPrecio;
	private JButton btnGuardar;
	private JTextField textFieldNombre;
	private JTextField textFieldTiempo;
	private JTextField textFieldPrecio;
	
	private ControlVIstaBD c;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaBD window = new VistaBD();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VistaBD() {
		initialize();
	}

	
	private void initialize() {
		
		c = new ControlVIstaBD(this);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 952, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabelNombre = new JLabel("Nombre");
		lblNewLabelNombre.setBounds(118, 101, 46, 14);
		frame.getContentPane().add(lblNewLabelNombre);
		
		lblNewLabelTiempo = new JLabel("Costo en tiempo");
		lblNewLabelTiempo.setBounds(118, 188, 91, 14);
		frame.getContentPane().add(lblNewLabelTiempo);
		
		lblNewLabelPrecio = new JLabel("Precio");
		lblNewLabelPrecio.setBounds(118, 271, 46, 14);
		frame.getContentPane().add(lblNewLabelPrecio);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(311, 354, 89, 23);
		btnGuardar.addActionListener(c);
		frame.getContentPane().add(btnGuardar);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(290, 98, 86, 20);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldTiempo = new JTextField();
		textFieldTiempo.setBounds(290, 185, 86, 20);
		frame.getContentPane().add(textFieldTiempo);
		textFieldTiempo.setColumns(10);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setBounds(290, 268, 86, 20);
		frame.getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
	}

	public JButton getBtnNewButton() {
		return btnGuardar;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnGuardar = btnNewButton;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldTiempo() {
		return textFieldTiempo;
	}

	public void setTextFieldTiempo(JTextField textFieldTiempo) {
		this.textFieldTiempo = textFieldTiempo;
	}

	public JTextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

	public void setTextFieldPrecio(JTextField textFieldPrecio) {
		this.textFieldPrecio = textFieldPrecio;
	}
}
*/