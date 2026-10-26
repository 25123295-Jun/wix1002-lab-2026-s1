package lab3;

import java.util.Scanner;

public class L3Q1 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        IO.println("Input 2 integers.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        IO.println("Enter operand");
        char op = sc.next().charAt(0);
        IO.println(num1 + " " + op + " " + num2);
        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                ans = num1 / num2;
            } else {
                IO.println("cannot divide by 0");
                return;
            }
        } else if (op == '%') {
            if (num2 != 0) {
                ans = num1 % num2;
            } else {
                IO.println("cannot divide by 0");
                return;
            }
        } else {
            IO.println("Please enter valid operand");
        }
        IO.println("The answer is" + ans);
    }
}
