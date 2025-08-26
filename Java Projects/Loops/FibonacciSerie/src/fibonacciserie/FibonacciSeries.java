/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacciserie;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Step 1: Get how many terms to generate
        try (Scanner sc = new Scanner(System.in)) {
            // Step 1: Get how many terms to generate
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            int first = 0, second = 1;
            System.out.println("Fibonacci Series up to " + n + " terms:");
            // Step 3: Use a loop to generate terms
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                
                // Step 4: Update values (shift to next terms)
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
