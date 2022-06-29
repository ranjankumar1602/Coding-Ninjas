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
import java.util.*;
public class Solution {
    
    private static LinkedListNode<Integer> middle(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        while(curr!=null) {
            LinkedListNode<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null) {
            return true;
        }
        LinkedListNode<Integer> mid=middle(head);
        LinkedListNode<Integer> last=reverse(mid);
        LinkedListNode<Integer> curr=head;
        while(last!=null) {
            if(last.data != curr.data) {
                return false;
                
            }
            last=last.next;
            curr=curr.next;
           
        }
         return true;
	}

}
