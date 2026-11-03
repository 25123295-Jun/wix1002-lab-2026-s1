import java.util.Scanner;
public class L4Q3 {
    static void main(String[] args) {
        double minScore = 100;
        double maxScore = 0;
        double sum = 0;
        int counter = 0;
        double sumSqrt = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Your Score[Negative to quit]");
        int iNum = num.nextInt();
        while (iNum >= 0) {
            counter++;
            sum += iNum;
            sumSqrt = Math.sqrt(sum);
            if (iNum > maxScore) {
                maxScore = iNum;
            }
            if (iNum < minScore) {
                minScore = iNum;
            }
            System.out.println("Enter Your Score[Negative to quit]");
            iNum = num.nextInt();
        }
        double avg = sum / counter;
        double var = (sumSqrt - (sum * sum) / counter) / (counter - 1);
        double sd = Math.sqrt(var);
        System.out.printf("Minimum Score: %.2f%n", minScore);
        System.out.printf("Maximum Score: %.2f%n", maxScore);
        System.out.printf("Average Score: %.2f%n", avg);
        System.out.printf("Standard Deviation: %.2f%n", sd);

    }
}
//or boolean negative = true;
//while negative = true; then if num<0 change boolean to false
