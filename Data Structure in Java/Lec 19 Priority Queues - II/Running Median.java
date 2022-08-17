
import java.util.*;

public class Solution {
    
    static PriorityQueue<Integer> min = new PriorityQueue<Integer>();
    static PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());

    private static void insert(int num) {
        if(max.isEmpty() || max.peek() >= num) {
            max.add(num);
        }else {
            min.add(num);
        }
        
        if(max.size() > min.size() + 1) {
            min.add(max.poll());
        }else if(max.size() < min.size()) {
            max.add(min.poll());
        }
    }
    
    private static int findMedian() {
        if(max.size() == min.size()) {
            return (max.peek() + min.peek())/2;
        }
        return max.peek();
    }
    
	public static void findMedian(int arr[])  {
        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
            System.out.print(findMedian() + " ");
        }   
    }
}
