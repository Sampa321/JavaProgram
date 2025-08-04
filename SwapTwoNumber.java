package HomePractice.SomeQuestion;
/*Java program to swap Two Number without third variable*/
/*Java program to swap Two Number using third variable*/

import java.util.Scanner;
public class SwapTwoNumber {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        //Question1:
        /*System.out.println("enter the value of a:");
        int a=SC.nextInt();
        System.out.println("enter the value of b:");
        int b=SC.nextInt();
        System.out.println("Before swaping,"+"a"+"="+a+","+"b="+b);//12,3
        a=a+b;//a=a^b,a=a*b
        b=a-b;//a=a^b,a=a/b
        a=a-b;//a=a^b,a=a/b
        System.out.println("After swaping,"+"a"+"="+a+","+"b="+b);*/

        //Question2:
        System.out.print("enter the value of a:");
        int a=SC.nextInt();
        System.out.print("enter the value of b:");
        int b=SC.nextInt();
        System.out.println("Before swaping,"+"a"+"="+a+","+"b="+b);//12,3
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swaping,"+"a"+"="+a+","+"b="+b);
    }
}
