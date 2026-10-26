package lab3;

import java.util.Scanner;

public class L3Q3 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter ur sales.");
        double sales = sc.nextDouble();
        double comm = 0;
        if (sales <= 100) {
            comm = sales * 0.05;
        } else if (sales > 100 && sales <= 500) {
            comm = sales * 0.075;
        } else if (sales > 500 && sales <= 1000) {
            comm = sales * 0.1;
        } else if (sales > 1000) {
            comm = sales * 0.125;
        }
        System.out.printf("Commision is %.2f",comm);
    }
}
