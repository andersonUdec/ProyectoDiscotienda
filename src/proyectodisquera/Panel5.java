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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Panel5 extends JPanel implements ActionListener{
    JLabel LDisco, LNomCancion, LDuracion;
    JComboBox CBDisco;
    JTextField JTNomCancion, JTDuracion;
    JButton BGuardar;
    
    private List<Cancion> listaCancion;
    private Cancion cancion;
    private VentanaPrincipal ventana;
    
     public Panel5(VentanaPrincipal ventana) {
         
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Canciones"));
         setLayout(null);
         listaCancion = new ArrayList<Cancion>();
         
         LDisco = new JLabel("Disco: ");
         LDisco.setBounds(30, 30, 100, 20);
         add(LDisco);
         
         CBDisco = new JComboBox();
         CBDisco.addItem("SELECCIONE");
         CBDisco.setBounds(140, 30, 150, 20);
         add(CBDisco);
         
         LNomCancion = new JLabel("Nombre Cancion: ");
         LNomCancion.setBounds(30, 60, 100, 20);
         add(LNomCancion);
         
         JTNomCancion= new JTextField();
         JTNomCancion.setBounds(140, 60, 150, 20);
         add(JTNomCancion);
         
         LDuracion = new JLabel("Duracion Cancion: ");
         LDuracion.setBounds(30, 90, 100, 20);
         add(LDuracion);
         
         JTDuracion= new JTextField();
         JTDuracion.setBounds(140, 90, 150, 20);
         add(JTDuracion);
         
         BGuardar = new JButton("Guardar");
         BGuardar.setBounds(140, 120, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);   
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
         if(validarDatosCancion()){
            cancion = new Cancion((String)CBDisco.getSelectedItem(), JTNomCancion.getText(), JTDuracion.getText());
            listaCancion.add(cancion);
            JOptionPane.showMessageDialog(this, "Cancion creada.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();            
       }
    }
    private boolean validarDatosCancion() {
        if(CBDisco.getSelectedItem() == "SELECCIONE") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Disco.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LDisco.setForeground(Color.red);
            return false;    
        }  
        else if(JTNomCancion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre de la cancion.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LNomCancion.setForeground(Color.red);
            return false;
        }else if(JTDuracion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una duracion.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LDuracion.setForeground(Color.red);
            return false;        
        }
        return true;
    }
    
    private void vaciarDatos() {
        JTNomCancion.setText("");
        JTDuracion.setText("");
        LNomCancion.setForeground(Color.BLACK);
        LDuracion.setForeground(Color.black);
        LDisco.setForeground(Color.black);
        CBDisco.setSelectedIndex(0);
    }
    
    public void actualizarDisco(String nombreDisco) {
       CBDisco.addItem(nombreDisco);
    }
    
    public List<Cancion> getListaCancion() {
        return listaCancion;
    }
}
