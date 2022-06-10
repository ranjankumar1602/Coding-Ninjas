public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
        int n=arr.length;   // length of the array
        int count=0;        // count the number of zeros in the array
        for(int i=0;i<n;i++) {
            if(arr[i]==0) {
                count++;
            }
        }
      
      //fill the number of zeros=count in the starting of the array 
        for(int i=0;i<count;i++) {
            arr[i]=0;
        }
      // now fill the remaining array with 1.
        for(int i=count;i<arr.length;i++) {
            arr[i]=1;
        }
        
    }
}
