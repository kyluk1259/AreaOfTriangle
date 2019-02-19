/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoftriangle;

import javax.swing.*;
import java.math.*;
/**
 * Kyle Lukaszek
 * 2/18/2019
 * Area of Triangle program
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize variables, let a be hyp, let b be base, let C be a
        double a, b, C, ang, area;
        
        //initialize question window for hypotenuse and convert hypotenuse to double
        String numHyp = JOptionPane.showInputDialog("Please enter the length of the hypotenuse");
        
        //convert numHyp into double
        a = Double.parseDouble(numHyp);
        
        //initialize question window for base
        String numBase = JOptionPane.showInputDialog("Please enter the length of the base");
        
        //convert numBase into double
        b = Double.parseDouble(numBase);
        
        //initialize question window for angle C
        String numAng = JOptionPane.showInputDialog("Please enter the angle between the base and the hypotenuse");
        
        //convert numAng into double
        ang = Double.parseDouble(numAng);
        
        //Convert angle input into radians and find get the value of Sin C
        C = Math.toRadians(ang);
        C = Math.sin(C);
        
        //calculate the value of area
        area = ((a * b) * C) / 2;
        
        //Display output window with area
        JOptionPane.showMessageDialog(null, "The area of the triangle is " + area + " units.");
    }
    
}
