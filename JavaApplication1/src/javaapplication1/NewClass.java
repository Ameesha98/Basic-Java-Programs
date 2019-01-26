/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class NewClass {
     private int n;
     public void get()
     {
          Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         n=sc.nextInt();
         System.out.println("The input number is: "+n);
     }
}
