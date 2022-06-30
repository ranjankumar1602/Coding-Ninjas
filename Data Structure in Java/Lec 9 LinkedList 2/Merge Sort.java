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
    
    private static LinkedListNode<Integer> middle(LinkedListNode<Integer> head) {
        if(head==null || head.next==null) {
            return head;
        }
        LinkedListNode<Integer> slow=head, fast=head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
    
    public static LinkedListNode<Integer> mergeList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }
        
        LinkedListNode<Integer> temp1=head1, temp2=head2, head=null, tail=null;
        
        if(temp1.data <= temp2.data) {
            head=temp1;
            tail=temp1;
            temp1=temp1.next;
            
        }else {
            head=temp2;
            tail=temp2;
            temp2=temp2.next;
        }
        
        while(temp1 != null && temp2 != null) {
            if(temp1.data <= temp2.data) {
                
                tail.next=temp1;
                tail=temp1;
                temp1=temp1.next;
                
            }else {
                
                tail.next=temp2;
                tail=temp2;
                temp2=temp2.next;
                
            }
            
        }
        
        if(temp1 == null) {
            tail.next=temp2;
        }
        if(temp2 == null) {
            tail.next=temp1;
        }
        
        return head;
    }

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> mid=middle(head);
        LinkedListNode<Integer> newMidHead=mid.next;
        mid.next=null;
        LinkedListNode<Integer> part1=mergeSort(head);
        LinkedListNode<Integer> part2=mergeSort(newMidHead);
        LinkedListNode<Integer> merge=mergeList(part1,part2);
        
		
        return merge;
	}

}
