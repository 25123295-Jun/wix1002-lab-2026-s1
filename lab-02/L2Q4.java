package lab2;

import java.util.Random;
import java.util.Scanner;

public class L2Q4 {
    static void main(String args[]) {
        System.out.println("Enter the number of seconds");
        Scanner sec = new Scanner(System.in);
        double newSec = sec.nextDouble();
        int hours = (int) newSec / 3600;
        double remainder = newSec%3600;
        int mins = (int) remainder/60;
        double seconds = remainder%60;
        System.out.println(newSec+" seconds is"+ hours+" hours, "+mins+" minutes, and "+seconds+" seconds.");
    }
}
