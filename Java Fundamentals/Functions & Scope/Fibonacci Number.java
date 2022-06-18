
public class Solution {
	
	public static boolean checkMember(int n){
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++) {
            arr[i]=arr[i-1]+arr[i-2];
            if(arr[i]==n){
                return true;
            }
        }
        return false;
	}
	

}
