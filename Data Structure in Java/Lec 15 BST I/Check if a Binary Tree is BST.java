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
    public static int checkMax(BinaryTreeNode<Integer> root) {
        if(root==null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(checkMax(root.left), checkMax(root.right)));
    }
    public static int checkMin(BinaryTreeNode<Integer> root) {
        if(root==null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(checkMin(root.left), checkMin(root.right)));
    }

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        if(root==null) {
            return true;
        }
		int leftMax=checkMax(root.left);
        int rightMin=checkMin(root.right);
        if(root.data <= leftMax || root.data > rightMin) {
            return false;
        }
        
        return isBST(root.left) && isBST(root.right);
        
	}

}
