	
public class Solution {
    
    private static int editDistance(String s1, String s2, int[][] storage) {
        int m = s1.length();
        int n = s2.length();
        if(storage[m][n] != -1) {
            return storage[m][n];
        }
        if(m == 0) {
            storage[m][n] = n;
            return storage[m][n];
        }
        if(n == 0) {
            storage[m][n] = m;
            return storage[m][n];
        }
        if(s1.charAt(0) == s2.charAt(0)) {
            storage[m][n] = editDistance(s1.substring(1), s2.substring(1), storage);
        }else {
            int op1 = editDistance(s1, s2.substring(1), storage);
            int op2 = editDistance(s1.substring(1), s2, storage);
            int op3 = editDistance(s1.substring(1), s2.substring(1), storage);
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
        }
        return storage[m][n];
    }

	public static int editDistance(String s, String t) {
		//Your code goes here
        int m = s.length();
        int n = t.length();
        int storage[][] = new int[m + 1][n + 1];
        for(int i = 0; i < storage.length; i++) {
            for(int j = 0; j < storage[0].length; j++) {
                storage[i][j] = -1;
            }
        }
        return editDistance(s, t, storage);
    }

}
