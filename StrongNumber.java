package HomePractice.SomeQuestion;
//*Check a number is strong Number or not.*/

import java.util.Scanner;
public class StrongNumber {
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int r=temp%10;
            sum+=factorial(r);
            temp/=10;
        }
        if(sum==num)
        {
            System.out.println(num +" is strong number");
        }
        else {
            System.out.println(num +" is not strong number");
        }
    }
}
