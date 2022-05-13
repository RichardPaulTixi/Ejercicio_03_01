/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ventana030101;

import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Ventana030101 extends JFrame{

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
     var y=new Ventana01("Hola Mundo",800, 600);
       y.setVisible(true);
       
      
       var y2=new Ventana030102("Ventana030102");
       y2.setVisible(true);
       
        var y3=new Ventana030104("Ventana030102");
       y3.setVisible(true);
       
       
       
    }
    
    
    
}
