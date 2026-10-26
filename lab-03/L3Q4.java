package lab3;

import java.util.Random;

public class L3Q4 {
    static void main(String args[]) {
        Random num = new Random();
        int fPlayerScore1 = num.nextInt(6) + 1;
        int fPlayerScore2 = num.nextInt(6) + 1;
        int sPlayerScore1 = num.nextInt(6) + 1;
        int sPlayerScore2 = num.nextInt(6) + 1;
        int totalScoreF = fPlayerScore1 + fPlayerScore2;
        int totalScoreS = sPlayerScore1 + sPlayerScore2;
        IO.println("Player1 Score:" + totalScoreF);
        IO.println("Player2 Score:" + totalScoreS);
        if (totalScoreF > totalScoreS) {
            IO.println("Winner:First player");
        } else if (totalScoreF < totalScoreS) {
            IO.println("Winner:Second player");
        } else {
            IO.println("Tied");
        }
    }
}
