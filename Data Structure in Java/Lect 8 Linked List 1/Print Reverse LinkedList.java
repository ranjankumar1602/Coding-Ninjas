/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        if(root==null) {
            return;
        }
        printReverse(root.next);
        System.out.print(root.data+" ");
	}

}
