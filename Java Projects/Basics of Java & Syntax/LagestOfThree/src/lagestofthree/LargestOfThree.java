/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lagestofthree;

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
            
            // Find largest
            int largest;
            
            if (a >= b && a >= c) {
                largest = a;
            } else if (b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }
            
            // Output result
            System.out.println("The largest number is: " + largest);
        }
    }
}
