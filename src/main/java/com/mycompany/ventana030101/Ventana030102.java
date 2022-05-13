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
        this.setSize(400, 200);
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
        this.jpanel1.setBackground(Color.WHITE);
        this.jpanel1.setBorder(BorderFactory.createTitledBorder(""));
        this.jpanel1.setLayout(new GridLayout(3,2));
    }
    
    
    public void iniciarEtiquetas(){
        this.jLabelList=new ArrayList<>();
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        
        this.jLabelList.get(0).setBackground(Color.GRAY);
        this.jLabelList.get(0).setOpaque(true);
        this.jLabelList.get(0).setText("Button 1");
        this.jpanel1.add(this.jLabelList.get(0));
       
        
        
        this.jLabelList.get(1).setBackground(Color.GRAY);
        this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(1).setText("2");
        this.jpanel1.add(this.jLabelList.get(1));
        
        this.jLabelList.get(2).setBackground(Color.GRAY);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.get(2).setText("Button 3");
        this.jpanel1.add(this.jLabelList.get(2));
        
        
        
        
        this.jLabelList.get(3).setBackground(Color.GRAY);
        this.jLabelList.get(3).setOpaque(true);
        this.jLabelList.get(3).setText("Long-Named Button 4");
        this.jpanel1.add(this.jLabelList.get(3));

        
        
        this.jLabelList.get(4).setBackground(Color.GRAY);
        this.jLabelList.get(4).setOpaque(true);
        this.jLabelList.get(4).setText("Button 5");
        this.jpanel1.add(this.jLabelList.get(4));
        
        this.jLabelList.get(5).setBackground(Color.GRAY);
        this.jLabelList.get(5).setOpaque(true);
        this.jLabelList.get(5).setText("");
        this.jpanel1.add(this.jLabelList.get(5));
        
        
        
    }
}
