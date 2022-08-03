import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
        int count = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
    	for (int i = 0; i < size; i++) {
        	if(m.containsKey(0 - input[i])) {
            	count += m.get(0 - input[i]);
        	}
        	if(m.containsKey(input[i])){
            	m.put(input[i], m.get(input[i]) + 1);
        	}else {
            	m.put(input[i], 1);
        	}
    	}
    	return count;
	}
}
