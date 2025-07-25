package Geeksforgeeks;

/*
ou are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size() + 1
 */

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6};
        long n= arr.length+1;//5
        long sum=(n*(n+1))/2;//
        long actualsum=0;
        for(int i=0;i<arr.length;i++)
        {
            actualsum+=(long)(arr[i]);
        }
        long missingNumber=(long)(sum-actualsum);
        System.out.println(missingNumber);
    }
}
