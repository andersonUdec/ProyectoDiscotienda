/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodisquera;

/**
 *
 * @author Andres Chila
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel2 extends JPanel implements ActionListener{
    
    JLabel LArtista, LDiscNombre, LPrecio;
    JTextField JTDiscNombre, JTPrecio;
    JComboBox CBArtista;
    JButton BGuardar;
    
    private List<Disco> listaDisco;
    private Disco disco;
    private VentanaPrincipal ventana;
    
    public Panel2(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Disco"));
         setLayout(null);
         listaDisco = new ArrayList<Disco>();
         
         LArtista = new JLabel("Artista: ");
         LArtista.setBounds(30, 30, 100, 20);
         add(LArtista);
         
         CBArtista = new JComboBox();
         CBArtista.addItem("SELECCIONE");
         CBArtista.setBounds(140, 30, 150, 20);
         add(CBArtista);
         
         LDiscNombre = new JLabel("Nombre Disco:");
         LDiscNombre.setBounds(30, 60, 100, 20);
         add(LDiscNombre);
         
         JTDiscNombre= new JTextField();
         JTDiscNombre.setBounds(140, 60, 150, 20);
         add(JTDiscNombre);
                  
         LPrecio = new JLabel("Precio Disco:");
         LPrecio.setBounds(30, 90, 90, 20);
         add(LPrecio);
         
         JTPrecio= new JTextField();
         JTPrecio.setBounds(140, 90, 150, 20);
         add(JTPrecio);
         
         BGuardar = new JButton("Guardar");
         BGuardar.setBounds(140, 120, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
                  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(validarDatosDisco()){
            String gb = JTPrecio.getText();
            int numero=Integer.parseInt(gb);
            disco = new Disco((String)CBArtista.getSelectedItem(), JTDiscNombre.getText(), numero);
            listaDisco.add(disco);
            JOptionPane.showMessageDialog(this, "Disco creado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
            this.ventana.getPanel5().actualizarDisco(disco.getDiscNombre());
            
       }
    }
    private boolean validarDatosDisco() {
        if(CBArtista.getSelectedItem() == "SELECCIONE") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un artista.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LArtista.setForeground(Color.red);
            return false;    
        }  
        else if(JTDiscNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del disco.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LDiscNombre.setForeground(Color.red);
            return false;
        }else if(JTPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LPrecio.setForeground(Color.red);
            return false;        
        }
        return true;
    }
    private void vaciarDatos() {
        JTDiscNombre.setText("");
        JTPrecio.setText("");
        LDiscNombre.setForeground(Color.BLACK);
        LArtista.setForeground(Color.black);
        LPrecio.setForeground(Color.black);
        CBArtista.setSelectedIndex(0);
    }
    
    
    public void actualizarArtista(String nombreArtista) {
        CBArtista.addItem(nombreArtista);
    }
    public List<Disco> getListaDisco() {
        return listaDisco;
    }
    
}
