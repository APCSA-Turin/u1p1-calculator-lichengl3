package com.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
    //DO NOT DELETE ANY OF THE CODE BELOW      
        DecimalFormat df = new DecimalFormat("#0.00"); //based off answers from https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + df.format(cost) + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + df.format(cost * (percent / 100.00)) + "\n" +
                       "Total Bill with tip: $" + df.format(cost + percent / 100.00 * cost) + "\n" +
                       "Per person cost before tip: $" + df.format(cost / people) + "\n" +
                       "Tip per person: $" + df.format(cost * (percent / 100.00) / people) + "\n" +
                       "Total cost per person: $" + df.format((cost + (percent /100.00) * cost) / people) + "\n" +
                       "-------------------------------\n";

        return result;

    }

     public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = false;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
      
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
