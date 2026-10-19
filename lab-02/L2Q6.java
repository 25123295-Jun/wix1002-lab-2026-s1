package lab2;

import java.util.Scanner;

public class L2Q6 {
     static void main(String args[]) {
        System.out.println("Enter the amount of water in gram");
        Scanner waterWeight = new Scanner(System.in);
        double G = waterWeight.nextDouble();
        double M = G/1000;
        System.out.println("Enter the initial temperature in Fahrenheit");
        Scanner initialTem = new Scanner(System.in);
        double I = initialTem.nextDouble();
        System.out.println("Enter the final temperature in Fahrenheit");
        Scanner finalTem = new Scanner(System.in);
        double F = finalTem.nextDouble();
        double T = F-I;
        double Q = M*T*4184;
        System.out.println("The energy needed is: "+ Q);
    }
}
