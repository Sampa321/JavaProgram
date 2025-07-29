package ExtraPractice;
import java.util.*;
public class RandomNumber {
    //create arraylist
    static ArrayList <Integer> list = new ArrayList<>();  //static using for store the random number
    // because non-static list can not use in static context

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //minimum random number
        System.out.print("Enter the minimum range:");
        int minValue = sc.nextInt();

        //maximum random number
        System.out.print("Enter the maximum range:");
        int maxValue = sc.nextInt();

        //print random number
        int randomNumber = random.nextInt((maxValue-minValue)+1)+minValue;
        System.out.println("Random Number:"+randomNumber);

        //store randomNumber in arraylist
        list.add(randomNumber);
        System.out.println(list);
    }
}
