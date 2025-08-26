/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumberCheck;

 import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        // Input a number
        try (Scanner sc = new Scanner(System.in)) {
            // Input a number
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            // Check even or odd
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }
}
