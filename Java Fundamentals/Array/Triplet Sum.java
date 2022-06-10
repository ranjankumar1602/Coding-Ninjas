
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	int count=0;
        int l=arr.length;
        for(int i=0;i<l-2;i++) {
            for(int j=i+1;j<l-1;j++) {
            	for(int k=j+1;k<l;k++) {
                    if(arr[i]+arr[j]+arr[k]==x) {
                        count++;
                    }
        		}
        	}
        }
        return count;
    }

}
