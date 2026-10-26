package lab3;

import java.util.Random;

public class L3Q2 {
    static void main(String args[]) {
        Random num = new Random();
        int Rnum = num.nextInt(6);
        String word = "";
        if (Rnum == 0) {
            word = "zero";
        } else if (Rnum == 1) {
            word = "one";
        } else if (Rnum == 2) {
            word = "two";
        } else if (Rnum == 3) {
            word = "three";
        } else if (Rnum == 4) {
            word = "four";
        } else if (Rnum == 5) {
            word = "five";
        }
        IO.println(Rnum + " is " + word);
    }
}
