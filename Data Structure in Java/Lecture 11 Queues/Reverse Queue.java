import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
        
        // using recursion
        if(input.size()==0) {
            return;
        }
        int front=input.peek();
        input.remove();
        reverseQueue(input);
        input.add(front);
        
        
        //Using Stacks
        // Stack<Integer> stack= new Stack<>();
        // while(!input.isEmpty()) {
        //     stack.add(input.peek());
        //     input.remove();
        // }
        // while(!stack.isEmpty()) {
        //     input.add(stack.peek());
        //     stack.pop();
        // }
	}

}
