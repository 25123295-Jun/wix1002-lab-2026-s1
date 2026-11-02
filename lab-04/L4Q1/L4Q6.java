package Lab4;

import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int digits = 0;
        int num=r.nextInt(Integer.MAX_VALUE);
        int oNum=num;
        if(num==0){
            digits = 0;
        }else{
            while(num>0){
                digits++;
                num/=10;
            }
        }
        System.out.println(oNum);
        System.out.println(digits);
    }
}
