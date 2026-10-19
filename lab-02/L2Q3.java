package lab2;

import java.util.Random;
import java.util.Scanner;

public class L2Q3 {
    static void main(String args[]) {
       Random rand = new Random();
        int num1 = rand.nextInt(41) + 10;
        int num2 = rand.nextInt(41) + 10;
        int num3 = rand.nextInt(41) + 10;
        int ans = num1 + num2 + num3;
        System.out.println("The sum of the numbers is "+ ans);
        double ave = ans /3;
        System.out.printf("The average of the numbers is %.2f", ave);
    }
}
