public class Solution {

	public static long staircase(int n) {
		//Your code goes here
        // using recursion
        // if(n==0) {
        //     return 1;
        // }else if(n<0) {
        //     return 0;
        // }else {
        //     return staircase(n-3) + staircase(n-2) + staircase(n-1);
        // }
        
        
        // using DP
        if(n == 0) {
            return 1;
        }
        if(n==1 || n==2) {
            return n;
        }
        long[] ans = new long[n+1];
        ans[0] = 1;
        ans[1] = 1;
        ans[2] = 2;
        for(int i = 3; i <= n; i++) {
            long op2 = 0, op3 = 0;
			long op1 = ans[i - 1];
			if(i - 2 >= 0)
				op2 = ans[i - 2];
			if(i - 3 >= 0)
				op3 = ans[i - 3];
			ans[i] = op1 + op2 + op3;
        }
        return ans[n];
	}

}
