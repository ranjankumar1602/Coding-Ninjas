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

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(i==j) {
            return head;
        }
        LinkedListNode<Integer> temp=head,prev=null,curr1=null,curr2=null,prev1=null,prev2=null;
        int pos=0;
        while(temp!=null)
        {
            if(pos==i)
            {
                prev1=prev;
                curr1=temp;
            }
			else if(pos==j) {
    			prev2=prev;
    			curr2=temp;
			}
            prev=temp;
            temp=temp.next;
            pos++;
        }
        if(prev1!=null)
        {
            prev1.next=curr2;
        }
        else{
            head=curr2;
        }
        if(prev2!=null){
            prev2.next=curr1;
        }
        else{
            head=curr1;
        }
        LinkedListNode<Integer> temp1=curr2.next;
        curr2.next=curr1.next;
        curr1.next=temp1;
        return head;
	}

}
