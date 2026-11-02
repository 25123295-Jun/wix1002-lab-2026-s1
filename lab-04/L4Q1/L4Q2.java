import java.util.Scanner;
public class L4Q2 {

    static void main(String args[]){
        Scanner num = new Scanner(System.in);
        IO.println("Enter an integer");
        int iNum = num.nextInt();
        long sum = 0;
        for(int i=0; i<=iNum;i++){
            int x =0;
            for(int q = 0;q<=i;q++){
                x+=q;
            }
        sum+=x;
        }
        IO.println(sum);
        }
    }
