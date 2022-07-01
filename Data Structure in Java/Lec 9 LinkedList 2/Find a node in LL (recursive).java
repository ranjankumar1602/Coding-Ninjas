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
    
    private static int findNodeRec(LinkedListNode<Integer> head,int n,int index) {
        if(head==null) {
            return -1;
        }
        if(head.data==n) {
            return index;
        }
        int ans=findNodeRec(head.next,n,index+1);
        
        return ans;
    }


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        
        return findNodeRec(head,n,0);
	}

}
