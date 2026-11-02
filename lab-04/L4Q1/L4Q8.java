package Lab4;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(101);
        int oNum = num;
        System.out.println("n = " + oNum);

        int counter = 2;

        while (num > 0) {
            boolean Prime = true;

            for (int i = 2; i < counter; i++) {
                if (counter % i == 0) {
                    Prime = false;
                    break;
                }
            }

            if (Prime) {
                System.out.println(counter + " is prime");
                num--;
            }

            counter++;
        }
    }
}
