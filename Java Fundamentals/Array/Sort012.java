
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
         int count0 = 0, count1 = 0;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            
            else if (arr[i] == 1){
                count1++;
            }
        }
        
        for(int i = 0; i<count0; i++){
            arr[i] = 0;
        }
        
        for(int i = count0; i<count0+count1; i++){
            arr[i] = 1;
        }
        
        for(int i = count0+count1; i<arr.length; i++){
            arr[i] = 2;
        }
    }

}
