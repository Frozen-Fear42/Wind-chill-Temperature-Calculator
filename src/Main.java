// Name: Humphrey Boahen
// Course Name: CS155-019
// Assignment Name: PA 2

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initializing a scanner to take user input
        Scanner input = new Scanner(System.in);

        // declaring variables
        double temperature = 0.0;
        double windSpeed = 0.0;
        double windChillTemperature;
        boolean isValid = false;

        // validating the user input
        while (!isValid){
            // promoting the user to enter a temperature
            System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
            temperature = input.nextDouble();
            
            if (temperature >= -58 && temperature <= 41) {
                isValid = true;

            } else {
                // displaying an error message
                System.out.println("Invalid input. Enter a temperature between -58°F and 41°F");
                System.out.println();
            }
        }

        // resetting isValid to false
        isValid = false;
        
        // validating the user input
        while (!isValid) {
            // promoting the user to enter the wind speed
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            windSpeed = input.nextDouble();

            if (windSpeed >= 2) {
                isValid = true;

            }else{
                // displaying an error message
                System.out.println("Invalid input. Enter a wind speed greater than 2");
                System.out.println();
            }
        }

        // calculating the wind-chill temperature 
        windChillTemperature = (35.74 + (0.6215*(temperature)) - (35.75*(Math.pow(windSpeed, 0.16)))
                                                 + (0.4275*temperature*(Math.pow(windSpeed, 0.16))));

        // displaying the wind-chill temperature
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        System.out.println("The wind chill index is " + decimalFormat.format(windChillTemperature));

        // closing the scanner
        input.close();
    }
}