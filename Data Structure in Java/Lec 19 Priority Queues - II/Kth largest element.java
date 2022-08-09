import java.util.PriorityQueue;

public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0;
        for( ; i < k; i++) {
            pq.add(input[i]);
        }
        for( ; i < input.length; i++) {
            if(input[i] > pq.element()) {
                pq.remove();
                pq.add(input[i]);
            }
        }
        return pq.element();
	}
}
