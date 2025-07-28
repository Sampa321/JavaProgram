package HomePractice.SomeQuestion;

import java.util.Scanner;

/*Check a number is perfect square or not.*/
public class PerfectSquare {

    static boolean isperfect(int n)
    {
        if(n>=0)
        {
            int sr=(int)(Math.sqrt(n));
            if((sr*sr)==n)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args)
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int x=SC.nextInt();
        if(isperfect(x)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
