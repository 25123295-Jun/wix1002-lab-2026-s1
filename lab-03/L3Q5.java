package lab3;

import java.util.Scanner;

public class L3Q5 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        IO.println("Input a,b,c,d,e,f.");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double d = sc.nextDouble();
        Double e = sc.nextDouble();
        Double f = sc.nextDouble();
        double sol = (a * d) - (b * c);
        if (sol == 0) {
            IO.println("No solution");
        } else {
            double x = ((e * d) - (b * f)) / sol;
            double y = ((a * f) - (e * c)) / sol;
            IO.println("x is" + x);
            IO.println("y is" + y);
        }
    }
}
