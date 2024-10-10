/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classwork;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2){
        return num1 + num2 ;
    }
    
    // Method to subtract two numbers
    public int deduct(int num1, int num2){
        return num1 - num2;
    }
    
    //Method to multiply two numbers
    public int multiplication(int num1, int num2){
        return num1*num2;
    }
    
    // Method to divide two numbers
    public int division(int num1, int num2){
        if(num2==0){
            JOptionPane.showMessageDialog(null, "Error: The usage of zero when dividing");
            return 0;
           
                    
        }
         return num1/num2;
    }
}
