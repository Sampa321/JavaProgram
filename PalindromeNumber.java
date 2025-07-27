package HomePractice.SomeQuestion;
/*Check a number is palindrome number or not.*/
/*Print palindrome number within range.*/

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args)
    {
        Scanner SC= new Scanner(System.in);
        System.out.print("enter the number:");
//        int a=SC.nextInt();
//        int t=a;
//        int rev=0;
//        while(t!=0)
//        {
//            rev=rev*10+(t%10);
//            t/=10;
//        }
//        if(rev==a)
//        {
//            System.out.print(a+" is palindrome number");
//        }
//        else
//        {
//            System.out.print(a+" is not palindrome number");
//        }


    //print palindrome number:
        int n= SC.nextInt();
        System.out.println("Palindrome number:");
        for(int i=1;i<=n;i++)
        {
            int t=i;
            int rev=0;
            while(t!=0)
            {
                rev=rev*10+(t%10);
                t/=10;
            }
            if(rev==i)
            {
                System.out.println(i);
            }
        }
    }
}
