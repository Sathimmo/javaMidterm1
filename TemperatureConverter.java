package lab;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option:");
        int choice = scanner.nextInt();

        double temperature;
        double convertedTemperature;

        switch (choice) {
            case 1 -> {
                System.out.println("Enter temperature in Celsius:");
                temperature = scanner.nextDouble();
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
            }
            case 2 -> {
                System.out.println("Enter temperature in Fahrenheit:");
                temperature = scanner.nextDouble();
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
            }
            default -> System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
