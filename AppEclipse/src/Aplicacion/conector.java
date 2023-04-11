package Aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import java.awt.SystemColor;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;


public class conector extends JFrame {
	private userStory user;
	//private main main;
	//private universalUIController universalUIController;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblYoComo;
	private JLabel lblRequiero;
	private JLabel lblTalQue;
	private JLabel lblCondiciones;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textTitulo_1;
	private JTextField textAutor_1;
	private JTextField textID_1;
	private JTextField textFecha_1;
	private JTextField textYocomo_1;
	private JTextField textRequiero_1;
	private JTextField textTalque;
	private JTextField textCondiciones_1;
	private JTextField textImportancia_1;
	private JTextField textComplejitud_1;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userStory userStory = null;
					conector frame = new conector(userStory);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	
	public conector(userStory us) {
		this.setLocationRelativeTo(null);
		this.user = us;
		//this.mostrar();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 894, 739);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//userStory = new userStory(textTitulo.getText(),textAutor.getText(),Integer.parseInt(textID.getText()),LocalDate.parse(textFecha.getText()),textYoComo.getText(),textRequiero.getText(),textTalQue.getText(),
				//		textCondiciones.getText(),Integer.parseInt(textImportancia.getText()),Integer.parseInt(textComplejidad.getText()));
				dispose();
				//userStory = new userStory(textTitulo_1.getText(),textAutor_1.getText(),Integer.parseInt(textID_1.getText()),LocalDate.parse(textFecha_1.getText()),textYocomo_1.getText(),textRequiero_1.getText(),textTalque.getText(),textCondiciones_1.getText(),Integer.parseInt(textImportancia_1.getText()),Integer.parseInt(textComplejitud_1.getText()));
				//if(main != null){
				//	 main.setVisible(true);
			//	}else {
				//	main main = new main(userStory);
				//	main.setVisible(true);
				//}
			}
		});
		
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
		btnNewButton.setBounds(318, 656, 129, 35);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Monospaced", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//volver atras
				dispose();
			}
		});
		btnNewButton_1.setBounds(513, 657, 141, 35);
		contentPane.add(btnNewButton_1);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(169, 40, 647, 606);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(50, 35, 553, 564);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlHighlight);
		
		lblYoComo = new JLabel("YO COMO :");
		lblYoComo.setForeground(new Color(128, 0, 0));
		lblYoComo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblYoComo.setBounds(39, 159, 134, 28);
		panel_1.add(lblYoComo);
		
		lblRequiero = new JLabel("REQUIERO :");
		lblRequiero.setForeground(new Color(128, 0, 0));
		lblRequiero.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblRequiero.setBounds(39, 213, 134, 41);
		panel_1.add(lblRequiero);
		
		lblTalQue = new JLabel("TAL QUE :");
		lblTalQue.setForeground(new Color(128, 0, 0));
		lblTalQue.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblTalQue.setBounds(39, 270, 88, 41);
		panel_1.add(lblTalQue);
		
		lblCondiciones = new JLabel("CONDICIONES :");
		lblCondiciones.setForeground(new Color(128, 0, 0));
		lblCondiciones.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
		lblCondiciones.setBounds(39, 334, 134, 35);
		panel_1.add(lblCondiciones);
		
		lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(358, 32, 68, 19);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Titulo :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(39, 27, 100, 28);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Autor :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(39, 69, 88, 19);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fecha :");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(358, 70, 68, 19);
		panel_1.add(lblNewLabel_4);
		
		textTitulo_1 = new JTextField();
		textTitulo_1.setBounds(126, 32, 159, 19);
		panel_1.add(textTitulo_1);
		textTitulo_1.setColumns(10);
		
		textAutor_1 = new JTextField();
		textAutor_1.setBounds(126, 73, 159, 19);
		panel_1.add(textAutor_1);
		textAutor_1.setColumns(10);
		
		textID_1 = new JTextField();
		textID_1.setBounds(437, 32, 82, 19);
		panel_1.add(textID_1);
		textID_1.setColumns(10);
		
		textFecha_1 = new JTextField();
		textFecha_1.setBounds(437, 73, 82, 19);
		panel_1.add(textFecha_1);
		textFecha_1.setColumns(10);
		
		textYocomo_1 = new JTextField();
		textYocomo_1.setBounds(207, 159, 299, 28);
		panel_1.add(textYocomo_1);
		textYocomo_1.setColumns(10);
		
		textRequiero_1 = new JTextField();
		textRequiero_1.setBounds(207, 219, 299, 28);
		panel_1.add(textRequiero_1);
		textRequiero_1.setColumns(10);
		
		textTalque = new JTextField();
		textTalque.setBounds(207, 276, 299, 28);
		panel_1.add(textTalque);
		textTalque.setColumns(10);
		
		textCondiciones_1 = new JTextField();
		textCondiciones_1.setBounds(202, 334, 304, 50);
		panel_1.add(textCondiciones_1);
		textCondiciones_1.setColumns(10);
		
		textImportancia_1 = new JTextField();
		textImportancia_1.setBounds(371, 449, 68, 70);
		panel_1.add(textImportancia_1);
		textImportancia_1.setColumns(10);
		
		textComplejitud_1 = new JTextField();
		textComplejitud_1.setBounds(438, 449, 68, 70);
		panel_1.add(textComplejitud_1);
		textComplejitud_1.setColumns(10);
		
		lblNewLabel_5 = new JLabel("PLANTILLA HISTORIA DE USUARIO");
		lblNewLabel_5.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 22));
		lblNewLabel_5.setBackground(Color.BLACK);
		lblNewLabel_5.setBounds(114, 0, 457, 32);
		panel.add(lblNewLabel_5);
	}
/*
	private void mostrar() {
		// TODO Auto-generated method stub
		textTitulo_1.setText(user.getTitulo());
		textAutor_1.setText(user.getAutor());
		textID_1.setText(user.getID() + "");
		textFecha_1.setText(user.getFecha() + "");
		textYocomo_1.setText(user.getYo());
		textRequiero_1.setText(user.getRequiero());
		textTalque.setText(user.getTalQue());
		textCondiciones_1.setText(user.getCondicionesDeAceptacion());
		textImportancia_1.setText(user.getImportancia() + "");
		textComplejitud_1.setText(user.getComplejidad() + "");
	}
	
	public userStory getUserStory() {
		return user;
	}
	*/	
}
