import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0;
        for(; i < k; i++) {
            pq.add(input[i]);
        }
        for(; i < input.length; i++) {
            int min = pq.element();
            if(min < input[i]) {
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
