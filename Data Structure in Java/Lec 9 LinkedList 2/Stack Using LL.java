
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    private Node head;
    private int size;


    public Stack() {
        head=null;
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return size;
    }

    public boolean isEmpty() {
        return getSize()==0;
    }

    public void push(int element) {
        Node newNode= new Node(element);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public int pop() {
        if(head==null){
            return -1;
        }
        int temp=head.data;
        head=head.next;
        size--;
        return temp;
    }

    public int top() {
        //Implement the top() function
        if(head==null) {
            return -1;
        }
        return head.data;
    }
}
