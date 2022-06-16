public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int len = arr.length;
        int first;
        int second;
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i<len; i++){
            if (first<arr[i]){
                first = arr[i];
            }
        }
        
        for (int j = 0; j<len; j++){
            if (arr[j] != first){
                second = Math.max(second, arr[j]);
            }
        }
        return second;
    }

}
