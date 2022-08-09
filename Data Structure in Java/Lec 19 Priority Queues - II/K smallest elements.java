import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int i = 0;
        for( ; i < k; i++) {
            pq.add(input[i]);
        }
        for( ; i < input.length; i++) {
            if(input[i] < pq.element()) {
                pq.remove();
                pq.add(input[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!pq.isEmpty()) {
            list.add(pq.remove());
        }
        return list;
	}
}
