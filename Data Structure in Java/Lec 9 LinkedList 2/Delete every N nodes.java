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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
        if(head==null) {
            return null;
        }
        if(M==0) {
            return null;
        }
        if(N==0) {
            return head;
        }
        int count;
        LinkedListNode<Integer> curr=head,temp;
        while(curr!=null) {
           for(count=1;count<M && curr!=null;count++) {
               curr=curr.next;
           }
            
            if(curr==null) {
                return head;
            }
            temp=curr.next;
            for(count=1;count<=N && temp!=null; count++) {
                temp=temp.next;
            }
            curr.next=temp;
            curr=temp;
        }
        return head;
	}
}
