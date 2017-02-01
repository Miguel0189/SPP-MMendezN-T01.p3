/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miguel Mendez Nevarez A01411490 IMT
package javaapplication6;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("programa para calcular distancia entre dos puntos X y Y");
         //Declaro variables
         double x1, x2, y1, y2, d, X, Y;
         Scanner kb = new Scanner (System.in);
         System.out.println("introduce x1");
          x1= kb.nextDouble();
        System.out.println("introduce y1");
        y1= kb.nextDouble();
        System.out.println("introduce x2");
        x2= kb.nextDouble();
        System.out.println("introduce y2");
        y2= kb.nextDouble();

        //calculando el resultado
        X= x1-x2;
        Y= y1-y2;
        d= Math.sqrt(Math.pow(X,2)+ Math.pow(Y,2));
        
        System.out.println("distancia entre los 2 puntos=" + d);
    }
    
}
