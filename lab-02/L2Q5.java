package lab2;

import java.util.Random;

public class L2Q5 {
    static void main(String args[]) {
       Random rand = new Random();
        int num1 = rand.nextInt(10001);
        int digit1 = num1%10;
        int digit2 = (num1/10)%10;
        int digit3 = (num1/100)%10;
        int digit4 = (num1/1000)%10;
        int digit5 = (num1/10000)%10;
        int sum = digit1 + digit2 + digit3 + digit4 + digit5
        System.out.println("The numbers is " +num1);
        System.out.printf("The sum of the number is " + sum);
    }
}
