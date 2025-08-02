package HomePractice.SomeQuestion;
/*Check a number is prime number or not.*/
/*Print prime number between range.*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=SC.nextInt();
//        int count=0;
//        for(int i=2;i<n;i++)
//        {
//            if(n%i==0)
//            {
//                count=1;
//                break;
//            }
//        }
//        if(count==0)
//        {
//            System.out.print(n+" is prime number");
//        }
//        else {
//            System.out.print(n+" is not prime number");
//        }

        System.out.println("enter the prime number:");
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }
    }
}
