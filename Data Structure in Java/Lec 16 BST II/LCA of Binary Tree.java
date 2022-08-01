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

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root == null) {
            return -1;
        }
        if(root.data == a || root.data == b) {
            return root.data;
        }
        int leftlca = getLCA(root.left, a, b);
        int rightlca = getLCA(root.right, a, b);
        if (leftlca != -1 && rightlca != -1) {
            return root.data;
        }
		return (leftlca != -1) ? leftlca : rightlca;
	}

}
