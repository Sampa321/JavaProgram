package HomePractice.SomeQuestion;
/*Check a number is armstrong number or not.*/
/*print armstrong number within range*/

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
//        System.out.println("enter the number:");
//        int a=SC.nextInt();
//        int temp=a;
//        int temp1=a;
//        int digit=0;
//        int arm=0;
//        while(temp!=0)
//        {
//            digit+=1;
//            temp/=10;
//        }
//        while(temp1!=0)
//        {
//            int r=temp1%10;
//            arm+=Math.pow(r,digit);
//            temp1/=10;
//        }
//        if(arm==a)
//        {
//            System.out.println(a+" is armstrong number");
//        }
//        else {
//            System.out.println(a+" is not armstrong number");
//        }

        System.out.print("Enter the range:");
        int n=SC.nextInt();
        System.out.println("Armstrong Number:");
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int digit=0;
            int temp1=i;
            while(temp!=0)
            {
                digit+=1;
                temp/=10;
            }
            int sum=0;
            while(temp1!=0)
            {
                sum+=Math.pow((temp1%10),digit);
                temp1/=10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }

    }
}
