package Geeksforgeeks;

/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.

Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
 */

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int [] arr={5,510,10,10,50};
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            max= arr[i] > max?arr[i]:max;
        }
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<max && arr[i]!=max){
                if(arr[i]>SecondMax)
                {
                    SecondMax=arr[i];
                }
            }
        }
        if(SecondMax==Integer.MIN_VALUE)
        {
            System.out.println("-1");
        }
        else {
            System.out.println(SecondMax);
        }
    }
}
