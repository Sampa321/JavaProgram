package HomePractice.GeeksForGeeks;

/*Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

        You need to solve this problem without utilizing the built-in sort function.

        Examples:

        Input: arr[] = [0, 1, 2, 0, 1, 2]
        Output: [0, 0, 1, 1, 2, 2]
        Explanation: 0s 1s and 2s are segregated into ascending order.
        Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
        Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
        Explanation: 0s 1s and 2s are segregated into ascending order.

        Follow up: Could you come up with a one-pass algorithm using only constant extra space?*/



import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,0,0,0,2};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
