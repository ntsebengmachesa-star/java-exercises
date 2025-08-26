/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofdigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Step 1: Input a number
        try (Scanner sc = new Scanner(System.in)) {
            // Step 1: Input a number
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            int sum = 0; // to hold the sum of digits
            
            // Step 2: Loop until the number becomes 0
            while (num != 0) {
                // Step 3: Extract the last digit
                int digit = num % 10;
                
                // Step 4: Add digit to sum
                sum += digit;
                
                // Step 5: Remove the last digit
                num = num / 10;
            }
            
            // Step 6: Print result
            System.out.println("Sum of digits = " + sum);
        }
    }
}
