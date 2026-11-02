package Lab4;
import java.util.Scanner;
import java.lang.Math;
public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal");
        double P = sc.nextDouble();
        System.out.println("Enter Yearly interest rate in %");
        int yIR = sc.nextInt();
        System.out.println("Enter Number of Months");
        double nOM = sc.nextDouble();
        double r = yIR/100/12;
        double mP = (P * r) / (1 - Math.pow(1 + r, -nOM));
        for (int n = 1; n <= nOM; n++) {
            double C = mP / Math.pow(1 + r, 1 + nOM - n);
            double L = mP - C;
            double R = L / r - C;
             System.out.print(C+" "+L+" "+R);
        }
}}
