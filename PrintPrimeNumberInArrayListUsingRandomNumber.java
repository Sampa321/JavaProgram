package ExtraPractice;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class PrintPrimeNumberInArrayListUsingRandomNumber {
    static ArrayList <Integer> list = new ArrayList<>();
    static ArrayList <Integer> primeList = new ArrayList<>();
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max value:");
        int maxValue =sc.nextInt();
        System.out.print("Enter the min value:");
        int minValue =sc.nextInt();
        for(int i = 0;i < 10;i++)
        {
            int randomNumber = random.nextInt((maxValue-minValue)+1)+minValue;
            list.add(randomNumber);
//            System.out.println(randomNumber);
            boolean prime = true;
            for(int j = 2;j < randomNumber;j++)
            {
                if(randomNumber%j ==  0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
              primeList.add(randomNumber);
            }
        }
        System.out.println(list);
        System.out.println(primeList);
    }
}
