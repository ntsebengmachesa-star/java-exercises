/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempconversion;

import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        // Input temperature in Celsius
        try (Scanner sc = new Scanner(System.in)) {
            // Input temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            
            // Convert to Fahrenheit
            double fahrenheit = (celsius * 9/5) + 32;
            
            // Output result
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}
