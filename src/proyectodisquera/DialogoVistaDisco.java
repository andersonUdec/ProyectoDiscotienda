/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodisquera;

import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Chila
 */
public class DialogoVistaDisco extends JDialog{
    
    JPanel panel;
    JTable tablaDisco;
    
    private DefaultTableModel dtm;
    private VentanaPrincipal ventana;
    public DialogoVistaDisco(VentanaPrincipal ventana) {
        this.ventana = ventana;
        setSize(300, 300);
        setTitle("Vista Disco");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Disco"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaDisco = new JTable(dtm);
        
        Object[] columna = {"Artista", "Nombre", "Precio"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        
        JScrollPane scrollPane = new JScrollPane(tablaDisco);
        scrollPane.setBounds(30, 30, 240, 200);
        panel.add(scrollPane);
    }
    
    public void actualizarTablaDisco() {
         List<Disco> lista = this.ventana.getPanel2().getListaDisco();
         for (Disco disco : lista) {
             Object[] fila = {disco.getArtNombre(), disco.getDiscNombre(), disco.getPrecio()};
             dtm.addRow(fila);
        }
    }
}

