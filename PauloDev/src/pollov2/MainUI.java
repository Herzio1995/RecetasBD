package pollov2;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainUI extends JFrame{
    public JPanel panel;
    private JTextField inputName;
    private JTextField inputPrice;
    private Conector cx;
    
    
    public MainUI(){
        this.setSize(500, 500);
        setTitle("Registro de receta");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cx = new Conector();
        cx.conectar();
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.gray);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel("Registro de receta");
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setBounds(40, 100, 400, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("century gothic", Font.BOLD, 30));
        panel.add(etiqueta);
    }
    
    private void colocarCajasDeTexto(){
        inputName = new JTextField();
        inputName.setBounds(140, 160, 200, 40);
        inputName.setHorizontalAlignment(SwingConstants.CENTER);
        inputName.setText("Nombre de la receta");
        panel.add(inputName);
        
        inputPrice = new JTextField();
        inputPrice.setBounds(190, 205, 100, 40);
        inputPrice.setHorizontalAlignment(SwingConstants.CENTER);
        inputPrice.setText("Proporcion");
        panel.add(inputPrice);
    }
    
    private void colocarBotones(){
        JButton registrarRecetaBoton = new JButton("Registrar");
        registrarRecetaBoton.setBounds(170, 270, 140, 40);
        registrarRecetaBoton.setHorizontalAlignment(SwingConstants.CENTER);
        registrarRecetaBoton.setFont(new Font("century gothic", Font.BOLD, 20));
        panel.add(registrarRecetaBoton);
        
        JLabel saludo;
        saludo = new JLabel();
        saludo.setBounds(20, 310, 450, 40);
        saludo.setFont(new Font("century gothic", Font.BOLD, 15));
        panel.add(saludo);
        
        
        
        ActionListener oyente = new ActionListenerImpl(saludo);
        registrarRecetaBoton.addActionListener(oyente);        
    }

    private class ActionListenerImpl implements ActionListener {

        private final JLabel saludo;

        public ActionListenerImpl(JLabel saludo) {
            this.saludo = saludo;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String receta = inputName.getText();
                int proporcion = Integer.parseInt(inputPrice.getText());
                String query = "SELECT receta, proporcion FROM recetas WHERE receta = '"+receta+"'";
                Statement st = cx.conectar().createStatement();
                ResultSet rs = st.executeQuery(query);
                if(rs.next()){
                    saludo.setText("Receta ya existe en la base de datos");
                }
                else{
                    String query2 = "INSERT INTO recetas VALUES(null, '"+inputName.getText()+"','"+Integer.parseInt(inputPrice.getText())+"')";
                    st.executeUpdate(query2);
                    saludo.setText("Receta registrada en la base de datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}