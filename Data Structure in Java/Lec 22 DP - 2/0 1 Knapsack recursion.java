import java.util.*;
public class Solution {
    
    private static int knapsackHelper(int[] weights, int[] values, int maxWeight, int i) {
        if(i == weights.length || maxWeight == 0) {
            return 0;
        }
        if(weights[i] > maxWeight) {
            return knapsackHelper(weights, values, maxWeight, i+1);
        }else {
            int op1 = values[i] + knapsackHelper(weights, values, maxWeight - weights[i], i+1);
            int op2 = knapsackHelper(weights, values, maxWeight, i+1);
            return Math.max(op1, op2);
        }
    }

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		return knapsackHelper(weights, values, maxWeight, 0);
	}

    
}
