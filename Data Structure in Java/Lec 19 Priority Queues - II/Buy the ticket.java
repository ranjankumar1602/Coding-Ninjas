import java.util.*;

public class Solution {
	
	public static int buyTicket(int input[], int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i = 0; i < input.length; i++) {
            queue.add(i);
            pq.add(input[i]);
        }
        int time = 0;
        while(!queue.isEmpty()) {
            if(input[queue.peek()] < pq.peek()) {
                queue.add(queue.poll());
            }else {
                int index = queue.poll();
                pq.remove();
                time++;
                if (index == k) {
                    break;
                }
            }
        }
        return time;

	}
}
