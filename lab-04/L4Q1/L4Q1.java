package Lab4;
import java.util.Scanner;
public class L4Q1 {
    static void main(String args[]){
        Scanner num = new Scanner(System.in);
        IO.println("Enter an integer");
        int iNum = num.nextInt();
        IO.println("The factors of "+iNum+" are: ");
        for(int i = 1;i<iNum+1;i++){
            if(iNum%i==0){
                IO.print(i+" ");
            }else{
                continue;
            }
        }
    }
}
