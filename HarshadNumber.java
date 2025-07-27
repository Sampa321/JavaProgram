package HomePractice.SomeQuestion;
/*Check a number is harshadnumber or not.*/
/*21   =2+1=3
21%3==0
 */
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=SC.nextInt();
        int temp=n,sum=0;
        while (temp!=0)
        {
            int r=temp%10;
            sum+=r;
            temp/=10;
        }
        if(n%sum==0)
        {
            System.out.println(n+" is harshadnumber");
        }
        else {
            System.out.println(n+" is not harshadnumber");
        }
    }

}
