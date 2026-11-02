package Lab4;

import java.util.Random;

public class L4Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int p1 = 0;
        int p2 = 0;
        int counter = 1;
        while (p1 <= 100 && p2 <= 100) {
            int dice = r.nextInt(6) + 1;
            if (counter == 1) {
                p1 += dice;
                System.out.println("P1 rolled a " + dice + " and is now on " + p1);
            } else {
                p2 += dice;
                System.out.println("P2 rolled a " + dice + " and is now on " + p2);
            }
            if (dice == 6) {
                System.out.println("Player rolled a 6 and gets an extra turn");
            } else {
                if (counter == 1) {
                    counter = 2;
                } else {
                    counter = 1;
                }
            }
        }
        if (p1 >= 100) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}
