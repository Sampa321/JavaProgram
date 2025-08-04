package HomePractice.SomeQuestion;
/*Sum of digit of a number*/

import java.util.Scanner;
public class SumDigitOfNumber {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("enter the number:");
        int a= SC.nextInt();
        int sum=0;
        while(a!=0)
        {
            sum+=(a%10);
            a/=10;
        }
        System.out.print("sum digit = "+sum);
    }
}
