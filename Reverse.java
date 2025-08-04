/*print reverse of a number*/
package HomePractice.SomeQuestion;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        System.out.println("Original Number = "+n);
        int reverse=0;
        while (n!=0)
        {
            reverse = reverse*10 + (n%10);
            n/=10;
        }

        System.out.println("Reverse Number = " + reverse);


    }
}
