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
class DoubleNode {
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}

public class Solution {
    
    private static DoubleNode reversePart(LinkedListNode<Integer> head)
    {
        if(head==null || head.next==null) {
        	DoubleNode ans=new DoubleNode();
        	ans.head=head;
        	ans.tail=head;
        	return ans;
        }
     
        DoubleNode ans=reversePart(head.next);
        ans.tail.next=head;
        head.next=null;
        ans.tail=ans.tail.next;
        return ans;
    }


	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        if(head==null || head.next==null || k==0) {
            return head;
        }
        LinkedListNode<Integer> head1=head,head2,tail1=head;
        int count=1;
        while(count<k && tail1.next!=null) {
            tail1=tail1.next;
            count++;
        }
        head2=tail1.next;
        tail1.next=null;
        DoubleNode ans=reversePart(head1);
        LinkedListNode<Integer> secondHead=kReverse(head2,k);
        ans.tail.next=secondHead;
        return ans.head;
	}

}
