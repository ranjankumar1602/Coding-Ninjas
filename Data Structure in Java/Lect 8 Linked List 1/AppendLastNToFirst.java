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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(head==null || n==0) {
            return head;
        }
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null ){
            temp=temp.next;
            count++;
        }
        int newcount=count-n-1;
        count=0;
        LinkedListNode<Integer> temp1=head;
        LinkedListNode<Integer> temp2=head;
        while(count<newcount) {
            temp1=temp1.next;
            count++;
        }
        head=temp1.next;
        temp1.next=null;
        LinkedListNode<Integer> tempHead=head;
		while(tempHead.next!=null)
		{
			tempHead=tempHead.next;
		}
		tempHead.next=temp2;
		return head;
	}

}
