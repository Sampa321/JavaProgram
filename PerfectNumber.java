package HomePractice.SomeQuestion;
/*Check a number is perfect number or not.*/
/*Print perfect number within range.*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<n;i++)
//        {
//            if(n%i==0)
//            {
//                sum+=i;
//            }
//        }
//        if(sum==n)
//        {
//            System.out.println(n+" is perfect number");
//        }
//        else {
//            System.out.println(n+" is not perfect number");
//        }

        //For range:
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        System.out.println("Perfect Number:");
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
