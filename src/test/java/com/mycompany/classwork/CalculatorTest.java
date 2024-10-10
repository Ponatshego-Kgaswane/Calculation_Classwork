/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.classwork;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class CalculatorTest {
      Calculator instance = new Calculator();

      @org.junit.jupiter.api.Test
    public void testAdd() {
        int num1 = 10;
        int num2 = 5;
        int expResult = 15;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testAddInvalid() {
        int num1 = 10;
        int num2 = 5;
        int expResult = 15; 
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDeduct() {
        int num1 = 10;
        int num2 = 5;
        int expResult = 5;
        int result = instance.deduct(num1, num2);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDeductInvalid() {
        int num1 = 10;
        int num2 = 5;
        int expResult = 5; 
        int result = instance.deduct(num1, num2);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        int num1 = 10;
        int num2 = 5;
        int expResult = 50;
        int result = instance.multiplication(num1, num2);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testMultiplicationInvalid() {
        int num1 = 10;
        int num2 = 0;
        int expResult = 0; 
        int result = instance.multiplication(num1, num2);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDivision() {
        int num1 = 10;
        int num2 = 5;
        double expResult = 2.0;
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0.01);
    }

    @org.junit.jupiter.api.Test
    public void testDivisionInvalid() {
        int num1 = 10;
        int num2 = 0;
        double expResult = 0.0; 
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0.01);
    }
    
    
}
