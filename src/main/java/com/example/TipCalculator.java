package com.example;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList; //https://www.w3schools.com/java/java_list.asp

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
    //DO NOT DELETE ANY OF THE CODE BELOW      
        DecimalFormat df = new DecimalFormat("#0.0#"); //based off answers from https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
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
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        String menuItem = Integer.toString(0); //from https://www.reddit.com/r/javahelp/comments/woawi3/converting_a_number_to_a_string/
        Scanner scan = new Scanner(System.in);
        ArrayList<String> menuItems = new ArrayList<>();

        while (!menuItem.equals(Integer.toString(-1))) {                //from https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
            //enter your code here 
            System.out.println("Enter a menu item or type \"-1\" to finish: ");
            try  { 
                menuItem = Integer.toString(scan.nextInt());                                         //from https://stackoverflow.com/questions/22644397/using-try-catch-java
            } catch (InputMismatchException e) {
                menuItems.add(scan.nextLine());
            }
        }
        menuItem = menuItems.toString();
        scan.close();
        return menuItem;
    }
      
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        System.out.println(calculateTip(people,percent,cost));
        System.out.println("Items Ordered: ");
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
