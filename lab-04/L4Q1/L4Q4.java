package Lab4;

import java.util.Scanner;

public class L4Q4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        boolean leap = true;
        int feb = 0;
        System.out.println("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday)");
        int firstDay = sc.nextInt();
        if(leap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
            feb = 29;
        }else {
            feb = 28;
        }
        int may = 31*2+30+ feb;
        int aug = 31*5+30*2+ feb;
        int startDayM = (firstDay + may) % 7;
        int startDayA = (firstDay + aug) % 7;
        for(int days = 0;days<may;days++){
            System.out.println(startDayA+days);
        }
        }
    }
}
