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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null) {
            return head;
        }
        LinkedListNode<Integer> oddHead=null, oddTail=null, evenHead=null, evenTail=null;
        while(head != null) {
            if(head.data%2==0) {
                if(evenHead==null && evenTail==null) {
                    evenHead=head;
                    evenTail=head;
                }else {
                    evenTail.next=head;
                    evenTail=head;
                }
                
            }else {
                if(oddHead==null && oddTail==null) {
                    oddHead=head;
                    oddTail=head;
                }else {
                    oddTail.next=head;
                    oddTail=head;
                }
               
            }
             head=head.next;
        }
       if(oddHead==null) {
           return evenHead;
       }else if(evenHead==null) {
           return oddHead;
       }else {
           oddTail.next=evenHead;
           evenTail.next=null;
           return oddHead;
       }
	}
}
