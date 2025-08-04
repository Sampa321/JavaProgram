package HomePractice.SomeQuestion;
/*Sum of first natural numbers.*/


import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the range:");
        int n=Sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
