package Aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class universalUIController extends JFrame {
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblYoComo;
	private JLabel lblRequiero;
	private JLabel lblTalQue;
	private JLabel lblCondiciones;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton BOTON1;
	private JButton btnNewButton;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;

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
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("PLANTILLA DE USUARIO");
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
		lblNewLabel.setBounds(221, 10, 335, 32);
		getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(91, 52, 624, 434);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblYoComo = new JLabel("YO COMO :");
		lblYoComo.setBounds(39, 42, 134, 28);
		lblYoComo.setForeground(new Color(128, 0, 0));
		lblYoComo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		panel.add(lblYoComo);
		
		lblRequiero = new JLabel("REQUIERO :");
		lblRequiero.setForeground(new Color(128, 0, 0));
		lblRequiero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblRequiero.setBounds(39, 87, 134, 41);
		panel.add(lblRequiero);
		
		lblTalQue = new JLabel("TAL QUE :");
		lblTalQue.setForeground(new Color(128, 0, 0));
		lblTalQue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblTalQue.setBounds(39, 138, 88, 41);
		panel.add(lblTalQue);
		
		lblCondiciones = new JLabel("CONDICIONES :");
		lblCondiciones.setForeground(new Color(128, 0, 0));
		lblCondiciones.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
		lblCondiciones.setBounds(39, 191, 134, 35);
		panel.add(lblCondiciones);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(201, 38, 339, 32);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(201, 89, 339, 35);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(201, 136, 339, 36);
		panel.add(textField_2);
		
		BOTON1 = new JButton("ACEPTAR");
		BOTON1.setForeground(Color.BLACK);
		BOTON1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 22));
		BOTON1.setBounds(39, 370, 134, 35);
		panel.add(BOTON1);
		
		btnNewButton = new JButton("SALIR");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 22));
		btnNewButton.setBounds(227, 370, 125, 35);
		panel.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(429, 332, 58, 73);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(487, 332, 53, 73);
		panel.add(textField_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 203, 339, 101);
		panel.add(textField_3);
		textField_3.setColumns(10);
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 533);
	}
}
