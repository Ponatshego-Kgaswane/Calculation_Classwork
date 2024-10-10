/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class ClassWork {

    public static void main(String[] args) {
        // Creation of an object
        Calculator calc = new Calculator();
        
        //While loop that gives user the platform to pick an operation
        while(true){
            String number1 = JOptionPane.showInputDialog("Please enter first number");
            int num1 = Integer.parseInt(number1);
            
             String number2 = JOptionPane.showInputDialog("Please enter second number");
            int num2 = Integer.parseInt(number2);
            
           
            String menu = "Pick an operation:\n1. Addition\n2. Subtracion\n3. Multiplication\n4. Division\n5.";
            String choice = JOptionPane.showInputDialog(menu);
            
            //The usage of switch cases
            switch(choice){
                //first sitch case using addition
                case "1":
                JOptionPane.showMessageDialog(null, "Result: " + calc.add(num1, num2));
                break;
                //second switch case using subtraction
                case "2": 
                    JOptionPane.showMessageDialog(null, "Result: " + calc.deduct(num1, num2));
                    break;
                    //third switch case using multiplication
                case "3":
                  JOptionPane.showMessageDialog(null, "Result: " + calc.multiplication(num1, num2)); 
                  break;
                  //fourth switch case using division
                case "4":
                    JOptionPane.showMessageDialog(null, "Result: " + calc.division(num1, num2));
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Exiting");
                    System.exit(0);
                    
                    // A message that is displayed when user picks ivalid option
                default:
                    JOptionPane.showMessageDialog(null, "invalid choice");
            }
            
        }
    }
}
