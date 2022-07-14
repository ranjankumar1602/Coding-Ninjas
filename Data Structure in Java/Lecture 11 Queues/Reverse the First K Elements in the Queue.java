import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        if(input.isEmpty() || k>input.size()) {
            return input;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++) {
            stack.push(input.peek());
            input.poll();
        }
        while (!stack.isEmpty()) { 
            input.add(stack.peek());
            stack.pop();
        } 
        for (int i = 0 ; i < input.size() - k;i++) { 
            input.add(input.peek());
            input.poll();
        }
        return input;
	}

}
