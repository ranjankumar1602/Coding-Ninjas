/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        while(curr != null) {
            LinkedListNode<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
	}
}
