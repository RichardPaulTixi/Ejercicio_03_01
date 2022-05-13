/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana030101;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ventana030102 extends JFrame{
    
    private JPanel jpanel1;
    private List<JLabel> jLabelList;

    public Ventana030102(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jpanel1);
    }
    
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
    }
    
    
    public void iniciarPanel(){
        this.jpanel1=new JPanel();
        this.jpanel1.setBackground(Color.LIGHT_GRAY);
        this.jpanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
        this.jpanel1.setLayout(new GridLayout(3,2));
    }
    
    
    public void iniciarEtiquetas(){
        this.jLabelList=new ArrayList<>();
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        
        this.jLabelList.get(0).setBackground(Color.CYAN);
        this.jLabelList.get(0).setOpaque(true);
        this.jLabelList.get(0).setText("Electronica y Automatizacion");
        this.jpanel1.add(this.jLabelList.get(0));
        var imagen1= new ImageIcon("C:\\Users\\HP\\Desktop\\UPS\\Periodo 60\\Programacion Orientada a Objetos\\Electronica.png");
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(50, 50, 50));
        this.jLabelList.get(0).setIcon(icono);
        
        
        
        this.jLabelList.get(1).setBackground(Color.GREEN);
        this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(1).setText("Telecomunicaciones");
        this.jpanel1.add(this.jLabelList.get(1));
        var imagen2= new ImageIcon("C:\\Users\\HP\\Desktop\\UPS\\Periodo 60\\Programacion Orientada a Objetos\\Telecomunicaciones.png");
        this.jLabelList.get(1).setIcon(imagen2);
        
        
        
        
        this.jLabelList.get(2).setBackground(Color.PINK);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.get(2).setText("Computacion");
        this.jpanel1.add(this.jLabelList.get(2));
        var imagen3= new ImageIcon("C:\\Users\\HP\\Desktop\\UPS\\Periodo 60\\Programacion Orientada a Objetos\\Computacion.png");
        this.jLabelList.get(2).setIcon(imagen3);
        
        
        this.jLabelList.get(3).setBackground(Color.MAGENTA);
        this.jLabelList.get(3).setOpaque(true);
        this.jLabelList.get(3).setText("Automotriz");
        this.jpanel1.add(this.jLabelList.get(3));
        
        
        this.jLabelList.get(4).setBackground(Color.ORANGE);
        this.jLabelList.get(4).setOpaque(true);
        this.jLabelList.get(4).setText("Mecanica");
        this.jpanel1.add(this.jLabelList.get(4));
    }
}
