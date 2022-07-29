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
        if(root==null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size=queue.size();
            while(size>0) {
                BinaryTreeNode<Integer> temp=queue.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null) {
                    queue.add(temp.left);
                }
                if(temp.right!=null) {
                    queue.add(temp.right);
                }
                size--;
            }
           System.out.println(); 
        }
	}
	
}
