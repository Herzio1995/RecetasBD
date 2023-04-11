package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class universalUIController extends JFrame {
	private userStory userStory;
	private ventana ventana;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblYoComo;
	private JLabel lblRequiero;
	private JLabel lblTalQue;
	private JLabel lblCondiciones;
	private JTextField textYoComo;
	private JTextField textRequiero;
	private JTextField textTalQue;
	private JTextField textImportancia;
	private JTextField textComplejidad;
	private JTextField textCondiciones;
	private JTextField textTitulo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textID;
	private JLabel lblNewLabel_3;
	private JTextField textAutor;
	private JLabel lblNewLabel_4;
	private JTextField textFecha;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					universalUIController frame = new universalUIController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public universalUIController() {
		setLocationRelativeTo(null);
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("PLANTILLA DE USUARIO");
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
		lblNewLabel.setBounds(221, 10, 335, 32);
		getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(91, 52, 624, 564);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblYoComo = new JLabel("YO COMO :");
		lblYoComo.setBounds(39, 159, 134, 28);
		lblYoComo.setForeground(new Color(128, 0, 0));
		lblYoComo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		panel.add(lblYoComo);
		
		lblRequiero = new JLabel("REQUIERO :");
		lblRequiero.setForeground(new Color(128, 0, 0));
		lblRequiero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblRequiero.setBounds(39, 213, 134, 41);
		panel.add(lblRequiero);
		
		lblTalQue = new JLabel("TAL QUE :");
		lblTalQue.setForeground(new Color(128, 0, 0));
		lblTalQue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblTalQue.setBounds(39, 270, 88, 41);
		panel.add(lblTalQue);
		
		lblCondiciones = new JLabel("CONDICIONES :");
		lblCondiciones.setForeground(new Color(128, 0, 0));
		lblCondiciones.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
		lblCondiciones.setBounds(39, 334, 134, 35);
		panel.add(lblCondiciones);
		
		textYoComo = new JTextField();
		textYoComo.setEditable(false);
		textYoComo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textYoComo.setColumns(10);
		textYoComo.setBounds(201, 160, 339, 32);
		panel.add(textYoComo);
		
		textRequiero = new JTextField();
		textRequiero.setEditable(false);
		textRequiero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textRequiero.setColumns(10);
		textRequiero.setBounds(201, 218, 339, 35);
		panel.add(textRequiero);
		
		textTalQue = new JTextField();
		textTalQue.setEditable(false);
		textTalQue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTalQue.setColumns(10);
		textTalQue.setBounds(201, 275, 339, 36);
		panel.add(textTalQue);
		
		textImportancia = new JTextField();
		textImportancia.setEditable(false);
		textImportancia.setForeground(Color.BLACK);
		textImportancia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textImportancia.setColumns(10);
		textImportancia.setBounds(433, 439, 58, 73);
		panel.add(textImportancia);
		
		textComplejidad = new JTextField();
		textComplejidad.setEditable(false);
		textComplejidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textComplejidad.setColumns(10);
		textComplejidad.setBounds(487, 439, 53, 73);
		panel.add(textComplejidad);
		
		textCondiciones = new JTextField();
		textCondiciones.setEditable(false);
		textCondiciones.setBounds(201, 334, 339, 61);
		panel.add(textCondiciones);
		textCondiciones.setColumns(10);
		
		textTitulo = new JTextField();
		textTitulo.setEditable(false);
		textTitulo.setBounds(137, 32, 211, 19);
		panel.add(textTitulo);
		textTitulo.setColumns(10);
		
		lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(358, 32, 68, 19);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Titulo :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(39, 27, 88, 28);
		panel.add(lblNewLabel_2);
		
		textID = new JTextField();
		textID.setEditable(false);
		textID.setBounds(433, 32, 80, 19);
		panel.add(textID);
		textID.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Autor :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(39, 69, 88, 19);
		panel.add(lblNewLabel_3);
		
		textAutor = new JTextField();
		textAutor.setEditable(false);
		textAutor.setBounds(137, 69, 211, 19);
		panel.add(textAutor);
		textAutor.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Fecha :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(358, 70, 68, 19);
		panel.add(lblNewLabel_4);
		
		textFecha = new JTextField();
		textFecha.setEditable(false);
		textFecha.setBounds(433, 73, 80, 19);
		panel.add(textFecha);
		textFecha.setColumns(10);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(529, 626, 98, 32);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ventana != null) {
					ventana.setVisible(true);
				}else {
					ventana = new ventana(userStory);
					ventana.setVisible(true);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(236, 626, 98, 32);
		getContentPane().add(btnNewButton_1);
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 712);
	}
}
