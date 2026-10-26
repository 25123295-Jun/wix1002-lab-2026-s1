package lab3;

import java.util.Scanner;

public class L3Q6 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        IO.println("The radius of circle.");
        Double ra = sc.nextDouble();
        IO.println("The coordinate in x.");
        Double x = sc.nextDouble();
        IO.println("The coordinate in y.");
        Double y = sc.nextDouble();
        if (x < ra && y < ra) {
            IO.println("the dot is inside.");
        } else if (x == ra || y == ra) {
            IO.println("the dot is on the line of circle.");
        } else {
            IO.println("the dot is outside.");
        }
    }
}
