/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication1;

import javax.swing.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author taiwa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
      
     int k = 0;
     ArrayList<Double> y = new ArrayList<>();
    ArrayList<Double> a = new ArrayList<>();
    ArrayList<Double> b = new ArrayList<>();
    ArrayList<Double> z = new ArrayList<>();
     double E = 0.2;
     a.add(k, 1.0); //a[k] = 1;
     b.add(k, 3.0); //b[k] = 3;
     
     y.add(k, a.get(k) + 0.382*(b.get(k) - a.get(k))); // y[k] = a[k] + 0.382*(b[k] - a[k]);
     z.add(k, a.get(k)+ b.get(k)-y.get(k)); // z[k] = a[k] + b[k] - y[k];
     k = -1;
     do{
        k++; 
    if (((y.get(k)*y.get(k)*y.get(k)) - 3*(y.get(k)*y.get(k)) + 2.5) <= ((z.get(k)*z.get(k)*z.get(k)) - 3*(z.get(k)*z.get(k)) + 2.5)) 
    {
    
    a.add(k+1, a.get(k));
    b.add(k+1, z.get(k)); // b[k+1] = z[k];
    y.add(k+1, a.get(k+1)+b.get(k+1)-y.get(k)); 
    z.add(k+1, y.get(k));
    }
    else
    {

    a.add(k+1, y.get(k));
    b.add(k+1, b.get(k));
    y.add(k+1, z.get(k));
    z.add(k+1, a.get(k+1)+b.get(k+1)-z.get(k)); 
     
    }
    
    } while(Math.abs((a.get(k+1) - b.get(k+1))) > E);
     
    double x = (a.get(k+1) + b.get(k+1))/2;
    JOptionPane.showMessageDialog(null,"Задана функция x^3 - 3(x^2) + 2.5, E=0.2, L0 = [1;3]\n" +
            "Значение Х* =" + x + "\n" +
            "Значение f(X*) = " + (x*x*x - 3*x*x + 2.5) + "\n  Значение К+1 = " + (k+1)); 

          }
    }