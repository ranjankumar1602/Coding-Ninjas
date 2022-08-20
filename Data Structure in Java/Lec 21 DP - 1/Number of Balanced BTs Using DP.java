import java.util.*;
public class Solution {

	public static int balancedBTs(int height){
        if(height == 0 || height == 1) {
            return 1;
        }
        if(height == 2) {
            return 3;
        }
        int dp[] = new int[height + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;
        int mod = (int) Math.pow(10, 9) + 7;
        for(int i = 3; i < dp.length; i++) {
            int x = dp[i-1];
            int y = dp[i-2];
            long a = (long) x * x;
            long b = (long) x * y * 2;
            int value1 = (int)(a % mod);
            int value2 = (int)(b % mod);
            dp[i] = (value1 + value2) % mod;
            
        }
        
        return dp[height];
	}
}
