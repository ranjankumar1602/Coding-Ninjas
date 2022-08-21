import java.util.*;
public class Solution {
    
    public static int minCostPath(int[][] input, int i, int j) {
		int r = input.length;
        int c = input[0].length;
        if(i == r - 1 && j == c - 1) {
            return input[i][j];
        }
        
        if(i >= r || j >= c) {
            return Integer.MAX_VALUE;
        }
        int op1 = minCostPath(input, i, j + 1);
        int op2 = minCostPath(input, i + 1, j + 1);
        int op3 = minCostPath(input, i + 1, j);
        return input[i][j] + Math.min(op1, Math.min(op2,op3));
	}

	public static int minCostPath(int[][] input) {
		//Your code goes here
        return minCostPath(input,0,0);
	}
}
