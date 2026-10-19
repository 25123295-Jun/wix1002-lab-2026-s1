package lab2;
import java.util.Scanner;
public class L2Q2 {
    static void main(String args[]) {
        System.out.println("Enter the price of the car");
        Scanner price = new Scanner(System.in);
        double P = price.nextDouble();
        System.out.println("Enter the downpayment");
        Scanner dPayment = new Scanner(System.in);
        double D = dPayment.nextDouble();
        System.out.println("Enter the Interest rate in %");
        Scanner iRate = new Scanner(System.in);
        double R = iRate.nextDouble();
        System.out.println("Enter the Loan duration in years");
        Scanner duration = new Scanner(System.in);
        double Y = duration.nextDouble();
        double M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly payment is : %.2f", M);
    }
}

