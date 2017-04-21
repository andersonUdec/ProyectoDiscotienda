/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodisquera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class VentanaPrincipal extends JFrame{
    
    private Panel1 panel1;
    private Panel2 panel2;
    private Panel3 panel3;
    private Panel4 panel4;
    private Panel5 panel5;
        
    public VentanaPrincipal() {
        setSize(800, 600);
        setTitle("DISCOTIENDA");
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        
        panel1 = new Panel1(this);
        panel1.setBounds(10, 100, 380, 350);
        add(panel1);
        
        panel2 = new Panel2(this);
        panel2.setBounds(400, 100, 390, 170);
        add(panel2);
        
        panel3 = new Panel3(this);
        panel3.setBounds(10, 10, 780, 90);
        add(panel3);
        
        panel4 = new Panel4(this);
        panel4.setBounds(10, 450, 780, 110);
        add(panel4);
        
        panel5 = new Panel5(this);
        panel5.setBounds(400, 280, 390, 170);
        add(panel5);
        
        setVisible(true);
    }

    public Panel1 getPanel1() {
        return panel1;
    }

    public Panel2 getPanel2() {
        return panel2;
    }

    public Panel3 getPanel3() {
        return panel3;
    }

    public Panel4 getPanel4() {
        return panel4;
    }

    public Panel5 getPanel5() {
        return panel5;
    }

}
