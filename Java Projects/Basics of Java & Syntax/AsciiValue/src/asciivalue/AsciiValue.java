/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asciivalue;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        // Input a character
        try (Scanner sc = new Scanner(System.in)) {
            // Input a character
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0); // reads the first character
            
            // Convert to ASCII (int)
            int ascii = (int) ch;
            
            // Output result
            System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
        }
    }
}
