public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
        // sum1 is the sum of all n-2 numbers
        int sum1=(arr.length-2)*(arr.length-1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum-sum1;
	}
}
