
public class Solution {
    
    private static boolean checkSequence(String a, String b, int m, int n) {
        if(m==0) {
            return true;
        }
        if(n==0) {
            return false;
        }
        if(a.charAt(m-1)==b.charAt(n-1)) {
            return checkSequence(a,b,m-1,n-1);
        }else {
            return checkSequence(a,b,m,n-1);
        }
    }
    
    
	public static boolean checkSequence(String a, String b) {
		int m=a.length();
        int n= b.length();
        
        return checkSequence(b,a,n,m);

	}
}
