package lab2;

import java.util.Random;

public class L2Q5 {
    static void main(String args[]) {
       Random rand = new Random();
        int num1 = rand.nextInt(10001);
        int number = num1;
        int digit = 0;
        while(number >0){
            digit += number%10;
            number /= 10;
        }
        System.out.println("The numbers is " +num1);
        System.out.printf("The sum of the number is " + digit);

    }
}
