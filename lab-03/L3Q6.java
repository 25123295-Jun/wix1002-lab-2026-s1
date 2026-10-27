package lab3;

import java.util.Scanner;
import java.lang.Math;
public class L3Q6 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        IO.println("The radius of circle.");
        Double ra = sc.nextDouble();
        IO.println("The coordinate in x.");
        Double x = sc.nextDouble();
        IO.println("The coordinate in y.");
        Double y = sc.nextDouble();
        if (Math.sqrt((x*x+(y*y))<=ra) {
            IO.println("the dot is inside.");
        } else {
            IO.println("the dot is outside.");
        }
    }
}
