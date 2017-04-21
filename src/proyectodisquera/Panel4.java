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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Panel4 extends JPanel implements ActionListener{
    private JButton BArtistas, BDiscos, BCanciones, BFactura;
    private DialogoVistaArtista dialogArtista;
    private DialogoVistaDisco dialogDisco;
    private DialogoVistaCancion dialogCancion;
    private DialogoVistaFactura dialogFactura;
    private VentanaPrincipal ventana;
     public Panel4(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Opciones"));
         setLayout(null);
         
         BArtistas = new JButton("Ver Artistas");
         BArtistas.setActionCommand("Artistas");
         BArtistas.setBounds(30, 40, 150, 30);
         BArtistas.addActionListener(this);
         add(BArtistas);
         
         BDiscos = new JButton("Ver Discos");
         BDiscos.setActionCommand("Discos");
         BDiscos.setBounds(190, 40, 150, 30);
         BDiscos.addActionListener(this);
         add(BDiscos); 
         
         BCanciones = new JButton("Ver Canciones");
         BCanciones.setActionCommand("Canciones");
         BCanciones.setBounds(350, 40, 150, 30);
         BCanciones.addActionListener(this);
         add(BCanciones);
         
         BFactura = new JButton("Factura");
         BFactura.setActionCommand("Factura");
         BFactura.setBounds(600, 40, 150, 30);
         BFactura.addActionListener(this);
         add(BFactura); 
         
         dialogArtista = new DialogoVistaArtista(this.ventana);
         dialogDisco = new DialogoVistaDisco(this.ventana);
         dialogCancion = new DialogoVistaCancion(this.ventana);
         dialogFactura = new DialogoVistaFactura(this.ventana);    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Artistas":
                dialogArtista.actualizarTablaArtista();
                dialogArtista.setVisible(true);
                break;
            case "Discos":
                dialogDisco.actualizarTablaDisco();
                dialogDisco.setVisible(true);
                break;
            case "Canciones":
                dialogCancion.actualizarTablaCancion();
                dialogCancion.setVisible(true);
                break;
            case "Factura":
                dialogFactura.actualizarTablaFactura();
                Object[] fila = {"Total", dialogFactura.getTotal()}; 
                dialogFactura.getDtm().addRow(fila);
                dialogFactura.setVisible(true);
                break;             
        }
    }
    
}
