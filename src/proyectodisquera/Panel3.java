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
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel3 extends JPanel{
    private JLabel imagen;
    private VentanaPrincipal ventana;
    
    public Panel3(VentanaPrincipal ventana) {
         
        this.ventana = ventana;
        setBackground(Color.WHITE);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        
        ImageIcon icon = new ImageIcon("imagenes/imagen.jpeg");        
        imagen = new JLabel();
        imagen.setIcon(icon);
        add(imagen);
        
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.GRAY));
    }
}
