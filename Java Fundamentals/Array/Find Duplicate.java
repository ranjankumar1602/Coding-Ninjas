
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	int element= -1;
    	for(int i=0;i<=arr.length-2;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    element=arr[i];
                }
            }
        }
        return element;
    }
}
