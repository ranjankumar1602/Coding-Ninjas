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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1==null) {
            return head2;
        }
        if(head2==null) {
            return head1;
        }
        LinkedListNode<Integer> temp1=head1, temp2=head2, head=null, tail=null;
        if(temp1.data<=temp2.data) {
            head=temp1;
            tail=temp1;
            temp1=temp1.next;
            
        }else {
            head=temp2;
            tail=temp2;
            temp2=temp2.next;
        }
        while(temp1!=null && temp2!=null) {
            if(temp1.data<=temp2.data) {
                tail.next=temp1;
                tail=temp1;
                temp1=temp1.next;
            }else {
                tail.next=temp2;
                tail=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null) {
            tail.next=temp2;
        }
        if(temp2==null) {
            tail.next=temp1;
        }
        return head;
    }

}
