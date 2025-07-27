package HomePractice.SomeQuestion;

import java.util.Scanner;

/*Check a year is leap year or not.*/
public class LeapYear {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter the year:");
        int y=SC.nextInt();
        if(y%400==0 || (y%4==0 && y%100!=0))
        {
            System.out.print(y+" is leap year");
        }
        else {
            System.out.print(y+" is not leap year");
        }
    }

}
