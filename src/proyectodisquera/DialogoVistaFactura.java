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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Chila
 */
public class DialogoVistaFactura extends JDialog{
    
    JPanel panel;
    JTable tablaDisco;
    JLabel LDiscoTienda, LFecha, LVendedor, LAdios, LPunto;
    private double total; 
    private DefaultTableModel dtm;
    private VentanaPrincipal ventana;
    public DialogoVistaFactura(VentanaPrincipal ventana) {
        this.ventana = ventana;
        setSize(500, 500);
        setTitle("Factura");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Factura"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        
        
        dtm = new DefaultTableModel();
        tablaDisco = new JTable(dtm);
        
        Object[] columna = {"Nombre", "Precio"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        JScrollPane scrollPane = new JScrollPane(tablaDisco);
        scrollPane.setBounds(30, 80, 240, 260);
        panel.add(scrollPane);    
        
        LDiscoTienda = new JLabel("DISCO TIENDA: ");
        LDiscoTienda.setBounds(30,30, 100, 20);
        panel.add(LDiscoTienda);
        
        LFecha = new JLabel("FECHA: 21/04/2017");
        LFecha.setBounds(120, 30, 120, 20);
        panel.add(LFecha);
        
        LVendedor = new JLabel("Atendido por: xxxxxxxxx");
        LVendedor.setBounds(30,240,240,260);
        panel.add(LVendedor);
        
        LAdios = new JLabel("Muchas gracias por su compra que tenga buen dia y regrese.");
        LAdios.setBounds(30, 260, 500, 260);
        panel.add(LAdios);
        
        LPunto = new JLabel("---------------------------------------------------------------------------------------------");
        LPunto.setBounds(30,230,500,260);
        panel.add(LPunto);
        
        LPunto = new JLabel("---------------------------------------------------------------------------------------------");
        LPunto.setBounds(30,270,500,260);
        panel.add(LPunto);
        
        LPunto = new JLabel("---------------------------------------------------------------------------------------------");
        LPunto.setBounds(30,40,500,20);
        panel.add(LPunto);
    }
    public void actualizarTablaFactura() {
         List<Disco> lista = this.ventana.getPanel2().getListaDisco();
         for (Disco disco : lista) {
             Object[] fila = {disco.getDiscNombre(), disco.getPrecio()};
             total+=disco.getPrecio();
             dtm.addRow(fila);
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DefaultTableModel getDtm() {
        return dtm;
    }

    public void setDtm(DefaultTableModel dtm) {
        this.dtm = dtm;
    }
    
}
