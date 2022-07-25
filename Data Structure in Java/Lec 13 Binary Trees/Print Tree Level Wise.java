import java.util.*;
/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTreeNode<Integer> front= queue.peek();
        	queue.poll();
            System.out.print(front.data+":");
        
        	if(front.left!=null) {
                queue.add(front.left);
                System.out.print("L:"+front.left.data);
        	}else {
                System.out.print("L:-1");
            }
            System.out.print(",");
        
        
        	if(front.right!=null) {
                queue.add(front.right);
                System.out.println("R:"+front.right.data);
            }else {
                System.out.println("R:-1");
            }
        }
	}
	
}
