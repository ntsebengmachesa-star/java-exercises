/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestofthree;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Input three numbers
        try (Scanner sc = new Scanner(System.in)) {
            // Input three numbers
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            
            System.out.print("Enter third number: ");
            int c = sc.nextInt();
            
            // Find largest using if-else
            if (a >= b && a >= c) {
                System.out.println("The largest number is: " + a);
            } else if (b >= a && b >= c) {
                System.out.println("The largest number is: " + b);
            } else {
                System.out.println("The largest number is: " + c);
            }
        }
    }
}
