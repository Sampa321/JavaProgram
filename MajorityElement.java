package HomePractice.GeeksForGeeks;

/*Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.

Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element.*/

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr= {3,3,3,3,1,2,4,5,3};
        int r=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            int ele=arr[0];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count+=1;
                    ele=arr[i];
                }
            }
            if(count>(arr.length/2))
            {
                r=ele;
                break;
            }
            else {
                r=-1;
            }
        }
        System.out.println(r);

    }
}
