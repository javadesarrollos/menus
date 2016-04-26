/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
        
public class Menus extends JFrame implements ActionListener{
    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;
    
    public Menus(){
    setLayout(null);
    barra = new JMenuBar();
    setJMenuBar(barra);
    
    menu1 = new JMenu("Archivo");
    barra.add(menu1);
    
    mi1 = new JMenuItem("Nuevo");
    mi1.addActionListener(this);
    menu1.add(mi1);
    
    mi2 = new JMenuItem("Abrir");
    mi2.addActionListener(this);
    menu1.add(mi2);
    
    mi3 = new JMenuItem("Guardar");
    mi3.addActionListener(this);
    menu1.add(mi3);
    }
    
    public void actionPerformed(ActionEvent e){
        Container f=this.getContentPane();
        if(e.getSource()==mi1){
            f.setBackground(new Color(0,255,0);
        }
        if(e.getSource()==mi2){
            f.setBackground(new Color(0,0,255);
        }
        if(e.getSource()==mi3){
            f.setBackground(new Color(255,0,0);
        }
    }
    
    public static void main(String[] args) {
        Menus ventana = new Menus();
        ventana.setBounds(10,20,300,200);
        ventana.setVisible(true);
    }
    
}
