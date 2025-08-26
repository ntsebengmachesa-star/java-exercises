/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialloop;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        // Input a number
        try (Scanner sc = new Scanner(System.in)) {
            // Input a number
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            
            long factorial = 1; // use long to handle big results
            
            // Multiply numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Output result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
}
