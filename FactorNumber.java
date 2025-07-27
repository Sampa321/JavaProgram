package HomePractice.SomeQuestion;
/*Factor of a number.*/

import java.util.Scanner;
public class FactorNumber {
    public static void main(String[] ARGS)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=SC.nextInt();
        System.out.println("Factors of "+a+" are:");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
