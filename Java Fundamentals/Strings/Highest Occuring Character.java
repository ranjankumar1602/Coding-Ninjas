
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        int length = str.length();
	        int[] occ = new int[260];
	        int len = occ.length;
	        int max = 0;
	        int maxi = 0;
	        
	        for(int i = 0; i<length; i++){
	            int var = (int)str.charAt(i);
	            occ[var]++;
	        }
	        
	        for(int j = 0; j<len; j++){
	            if (occ[j]>max){
	                max = occ[j];
	                maxi = j;
	            }
	        }
	        
	        char ans = (char)maxi;
	        
	        return ans;
	}

}
