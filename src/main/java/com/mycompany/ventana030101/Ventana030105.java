/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana030101;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.GridLayout;
import java.awt.HeadlessException;
//import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ventana030105 extends JFrame{
    
    private JPanel jpanel1;
    //private JPanel jpanelBandera;
    private List<JLabel> jLabelList;
    //private List<JLabel> jBanderaList;

    public Ventana030105(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 200);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jpanel1);
    }
    
    public void iniciarComponentes(){
        this.iniciarPanel();
        //this.iniciarBandera();
        this.iniciarEtiquetas();
        
    }
    
    
    public void iniciarPanel(){
        this.jpanel1=new JPanel();
        this.jpanel1.setBackground(Color.LIGHT_GRAY);
        this.jpanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
        this.jpanel1.setLayout(new BorderLayout(3,2));
        
    }
    
    
    public void iniciarEtiquetas(){
        this.jLabelList=new ArrayList<>();
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        
        this.jLabelList.get(0).setBackground(Color.WHITE);
        this.jLabelList.get(0).setOpaque(true);
        this.jLabelList.get(0).setText("Button 1");
        this.jpanel1.add(this.jLabelList.get(0), BorderLayout.NORTH);

        
        this.jLabelList.get(1).setBackground(Color.YELLOW);
        this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(1).setText("2");
        this.jpanel1.add(this.jLabelList.get(1), BorderLayout.CENTER);
        
        this.jLabelList.get(2).setBackground(Color.GRAY);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.get(2).setText("Long Named Buttom 4");
        this.jpanel1.add(this.jLabelList.get(2), BorderLayout.SOUTH);

        
        
        this.jLabelList.get(3).setBackground(Color.MAGENTA);
        this.jLabelList.get(3).setOpaque(true);
        this.jLabelList.get(3).setText("Button 5");
        this.jpanel1.add(this.jLabelList.get(3), BorderLayout.EAST);
        
        
        this.jLabelList.get(4).setBackground(Color.LIGHT_GRAY);
        this.jLabelList.get(4).setOpaque(true);
        this.jLabelList.get(4).setText("Button 3");
        this.jpanel1.add(this.jLabelList.get(4), BorderLayout.WEST);
    }
    
    /*public void iniciarBandera (){
        this.jpanelBandera=new JPanel();
        this.jpanelBandera.setLayout(new GridLayout(7,7));
        
        
        this.jBanderaList=new ArrayList<>();
        
        for(var i=0;i<49;i++)
        this.jBanderaList.add(new JLabel());
        
        
        this.jBanderaList.get(0).setBackground(Color.RED);
        this.jBanderaList.get(1).setBackground(Color.WHITE);
        this.jBanderaList.get(2).setBackground(Color.BLUE);
        this.jBanderaList.get(3).setBackground(Color.WHITE);
        this.jBanderaList.get(4).setBackground(Color.RED);
        this.jBanderaList.get(5).setBackground(Color.RED);
        this.jBanderaList.get(6).setBackground(Color.RED);
        this.jBanderaList.get(7).setBackground(Color.RED);
        this.jBanderaList.get(8).setBackground(Color.WHITE);
        this.jBanderaList.get(9).setBackground(Color.BLUE);
        this.jBanderaList.get(10).setBackground(Color.WHITE);
        this.jBanderaList.get(11).setBackground(Color.RED);
        this.jBanderaList.get(12).setBackground(Color.RED);
        this.jBanderaList.get(13).setBackground(Color.RED);
        this.jBanderaList.get(14).setBackground(Color.WHITE);
        this.jBanderaList.get(15).setBackground(Color.WHITE);
        this.jBanderaList.get(16).setBackground(Color.BLUE);
        this.jBanderaList.get(17).setBackground(Color.WHITE);
        this.jBanderaList.get(18).setBackground(Color.WHITE);
        this.jBanderaList.get(19).setBackground(Color.WHITE);
        this.jBanderaList.get(20).setBackground(Color.WHITE);
        this.jBanderaList.get(21).setBackground(Color.BLUE);
        this.jBanderaList.get(22).setBackground(Color.BLUE);
        this.jBanderaList.get(23).setBackground(Color.BLUE);
        this.jBanderaList.get(24).setBackground(Color.BLUE);
        this.jBanderaList.get(25).setBackground(Color.BLUE);
        this.jBanderaList.get(26).setBackground(Color.BLUE);
        this.jBanderaList.get(27).setBackground(Color.BLUE);
        this.jBanderaList.get(28).setBackground(Color.WHITE);
        this.jBanderaList.get(29).setBackground(Color.WHITE);
        this.jBanderaList.get(30).setBackground(Color.BLUE);
        this.jBanderaList.get(31).setBackground(Color.WHITE);
        this.jBanderaList.get(32).setBackground(Color.WHITE);
        this.jBanderaList.get(33).setBackground(Color.WHITE);
        this.jBanderaList.get(34).setBackground(Color.WHITE);
        this.jBanderaList.get(35).setBackground(Color.RED);
        this.jBanderaList.get(36).setBackground(Color.WHITE);
        this.jBanderaList.get(37).setBackground(Color.BLUE);
        this.jBanderaList.get(38).setBackground(Color.WHITE);
        this.jBanderaList.get(39).setBackground(Color.RED);
        this.jBanderaList.get(40).setBackground(Color.RED);
        this.jBanderaList.get(41).setBackground(Color.RED);
        this.jBanderaList.get(42).setBackground(Color.RED);
        this.jBanderaList.get(43).setBackground(Color.WHITE);
        this.jBanderaList.get(44).setBackground(Color.BLUE);
        this.jBanderaList.get(45).setBackground(Color.WHITE);
        this.jBanderaList.get(46).setBackground(Color.RED);
        this.jBanderaList.get(47).setBackground(Color.RED);
        this.jBanderaList.get(48).setBackground(Color.RED);
        
        
        
    }/*
    
    */
}
