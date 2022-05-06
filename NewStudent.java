/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.newstudent;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Lee
 */
public class NewStudent {

    public static void main(String[] args) {
        
        Student stu = new Student();
        
        System.out.println("You will be entering your ID number and credit hours");
        
        
        // Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your ID number: "));
        System.out.println("Please enter your ID number: ");  
        int tempIDnum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your ID number: "));
        stu.setIDnum(tempIDnum);
        System.out.println(stu.getIDnum());
          
        int tempCRhours = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your credit hours: "));
        stu.setCRhours(tempCRhours);
        System.out.println(stu.getCRhours());
        
        JOptionPane.showMessageDialog(null, "To work out your points you have earned is your credit hours * 3");  
        int tempPoints = tempCRhours*4;
        stu.setPoints(tempPoints);
        JOptionPane.showMessageDialog(null, "The points youve earned is "+tempPoints);
        
        
        stu.GPA();
       
       
        
    }
  
}
