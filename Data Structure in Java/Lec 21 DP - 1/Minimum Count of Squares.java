import java.util.*;
public class Solution {

	public static int minCount(int n) {
		//Your code goes here
        if(n < 3) {
            return n;
        }
        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 3;
        for(int i = 4; i <= n; i++) {
            int temp = i;
            for(int j = 1; j <= Math.sqrt(i); j++) {
				temp = Math.min(temp, ans[i - j * j] + 1);
			}
			ans[i] = temp;
        }
        
        return ans[n];
	}

}
