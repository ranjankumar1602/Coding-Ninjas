import java.util.*;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
        if(arr.length == 0) {
            return 0;
        }
        
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int sum = 0;
        int maxLength = 0;
        int maxLength1 = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(map.containsKey(sum)){
                int k=map.get(sum);
                int l = i - k;
                maxLength1 = l;
            }else
            	map.put(sum, i);
            
            if(sum == 0){
                maxLength1 = i + 1;
            }
           
            if(maxLength1 > maxLength)
                maxLength = maxLength1;
        }
		return maxLength;
	}
}
