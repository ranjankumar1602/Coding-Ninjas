import java.util.*;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
        int solution=Integer.MIN_VALUE;
        int len= budget.length;
        Arrays.sort(budget);
        
        for(int i=0;i<len;i++) {
            solution=Math.max(solution, budget[i] * (len-i));
        }
        return solution;

	}

}
