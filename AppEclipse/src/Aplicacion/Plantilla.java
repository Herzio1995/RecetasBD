package Aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Plantilla extends JFrame {

	private JPanel contentPane;
	private JTextField CAJA1;
	private JTextField CAJA2;
	private JTextField CAJA3;
	private JTextField CAJA4;
	private JTextField C;
	private JTextField V;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plantillaa frame = new Plantillaa();
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
	public Plantilla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		btnNewButton.setBounds(309, 384, 126, 35);
		contentPane.add(btnNewButton);
		
		C = new JTextField();
		C.setForeground(new Color(0, 0, 0));
		C.setFont(new Font("Tahoma", Font.PLAIN, 14));
		C.setBounds(529, 358, 52, 61);
		contentPane.add(C);
		C.setColumns(10);
		
		V = new JTextField();
		V.setFont(new Font("Tahoma", Font.PLAIN, 14));
		V.setBounds(581, 358, 52, 61);
		contentPane.add(V);
		V.setColumns(10);
		
		JButton BOTON1 = new JButton("ACEPTAR");
		BOTON1.setForeground(new Color(0, 0, 0));
		BOTON1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		BOTON1.setBounds(165, 384, 134, 35);
		contentPane.add(BOTON1);
		
		CAJA4 = new JTextField();
		CAJA4.setBounds(268, 236, 365, 112);
		contentPane.add(CAJA4);
		CAJA4.setColumns(10);
		
		JLabel PASO4 = new JLabel("CONDICIONES:");
		PASO4.setForeground(new Color(128, 0, 0));
		PASO4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
		PASO4.setBounds(138, 236, 134, 35);
		contentPane.add(PASO4);
		
		CAJA3 = new JTextField();
		CAJA3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CAJA3.setBounds(252, 191, 317, 35);
		contentPane.add(CAJA3);
		CAJA3.setColumns(10);
		
		CAJA2 = new JTextField();
		CAJA2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CAJA2.setBounds(252, 134, 317, 41);
		contentPane.add(CAJA2);
		CAJA2.setColumns(10);
		
		CAJA1 = new JTextField();
		CAJA1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CAJA1.setBounds(252, 76, 313, 41);
		contentPane.add(CAJA1);
		CAJA1.setColumns(10);
		
		JLabel PASO3 = new JLabel("TAL QUE:");
		PASO3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		PASO3.setForeground(new Color(128, 0, 0));
		PASO3.setBounds(138, 185, 88, 41);
		contentPane.add(PASO3);
		
		JLabel PASO2 = new JLabel("REQUIERO:");
		PASO2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		PASO2.setForeground(new Color(128, 0, 0));
		PASO2.setBounds(138, 134, 104, 41);
		contentPane.add(PASO2);
		
		JLabel PASO1 = new JLabel("YO COMO:");
		PASO1.setForeground(new Color(128, 0, 0));
		PASO1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		PASO1.setBounds(138, 89, 104, 28);
		contentPane.add(PASO1);
		
		JLabel titulo = new JLabel("Plantilla de Usuario");
		titulo.setFont(new Font("Algerian", Font.PLAIN, 24));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(238, 15, 276, 28);
		contentPane.add(titulo);
		
		JPanel panel = new JPanel();
		panel.setBounds(124, 53, 535, 389);
		contentPane.add(panel);
		
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon("C:\\Users\\HP VICTUS\\Downloads\\456.jpg"));
		fondo.setBounds(0, 0, 790, 464);
		contentPane.add(fondo);
	}
}
