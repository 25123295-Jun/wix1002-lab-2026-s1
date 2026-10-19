package lab2;

import java.util.Scanner;

public class L2Q1 {
    static void main(String args[]) {
        System.out.println("Enter the temperature in Fahrenheit and converts to Celsius");
        Scanner Fah = new Scanner(System.in);
        double newFah = Fah.nextDouble();
        double celsius = (newFah - 32) / 1.8;
        System.out.println("The temperature is " + celsius + "°C");
    }
}
