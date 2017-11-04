package org.algo;

import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip =  mealCost*Double.valueOf((tipPercent))/100;
        double tax = mealCost*Double.valueOf((taxPercent))/100;
        double abc = mealCost + tax + tip;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(abc);
        System.out.println("The total meal cost is "+totalCost+" dollars.");	

        // Print your result
    }
}