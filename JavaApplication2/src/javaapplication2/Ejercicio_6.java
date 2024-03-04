/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab3
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
       float num1 , num2;
      
       
       num1 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el primer numero"));
       num2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el sehundo numero"));
       JOptionPane.showMessageDialog(null,"la suma es: "+(num1 + num2)
               +"\nla resta es: "+(num1 - num2)
               +"\nla multiplicacion es: "+(num1 * num2)
               +"\nla division es: "+(num1 / num2));
     
     }
    
}
