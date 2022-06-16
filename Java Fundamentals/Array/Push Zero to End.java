public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
  
        int i = 0;
        int k = 0;
        int temp = 0;
        
        for(i = 0; i<arr.length; i++){
            if (arr[i]!=0){
                
                //swapping the elements
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        
    }

}
