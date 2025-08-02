package HomePractice.SomeQuestion;
//*Finding Prime Factors of a number.*/

import java.util.Scanner;
public class PrimeFactorNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {

            if(num%i==0)
            {
                int count=0;
                for(int j=2;j<i;j++)
                {

                    if(i%j==0)
                    {
                        count=1;

                    }
                }
                if(count==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
