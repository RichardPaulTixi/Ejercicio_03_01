/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana030101;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ventana01 extends JFrame{
    
    private final ArrayList<JPanel> jPanelList = new ArrayList<>();;

    public Ventana01(String title, int w, int h){
       
        super(title);
        this.setSize(w, h);
        var p=new Point(500,150);
        this.setLocation(p);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Ventana01(int w, int h) {
        var dimension = new Dimension(w,h);
        this.setSize(dimension);
    }
    
    
    public void iniciarComponentes() {
      this.iniciarPaneles();
     
    }
    
    public void iniciarPaneles(){
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        
        this.jPanelList.get(0).setBackground(Color.GRAY);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Panel Principal"));
        
        this.jPanelList.get(1).setBackground(Color.RED);
        //this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder("Button 1"));
        this.jPanelList.get(1).add(new JLabel("Button 1"));
        
        
        this.jPanelList.get(2).setBackground(Color.BLUE);
        //this.jPanelList.get(2).setBorder(BorderFactory.createTitledBorder("2"));
        this.jPanelList.get(2).add(new JLabel("Button 2"));
        
        this.jPanelList.get(3).setBackground(Color.CYAN);
        //this.jPanelList.get(3).setBorder(BorderFactory.createTitledBorder("Button 3"));
        this.jPanelList.get(3).add(new JLabel("Button 3"));
        
        this.jPanelList.get(4).setBackground(Color.YELLOW);
        //this.jPanelList.get(4).setBorder(BorderFactory.createTitledBorder("LongNamed button 4"));
        this.jPanelList.get(4).add(new JLabel("Button 4"));
        
        this.jPanelList.get(5).setBackground(Color.GREEN);
        //this.jPanelList.get(5).setBorder(BorderFactory.createTitledBorder("Button 5"));
        this.jPanelList.get(5).add(new JLabel("Button 5"));
       
        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));

    }
    
}
