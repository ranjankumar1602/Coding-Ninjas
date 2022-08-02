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
    
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String s) {
        if(root==null) {
            return;
        }
        int rootData=root.data;
        s = s + rootData +" ";
        if(rootData == k && root.left == null && root.right == null) {
            System.out.println(s);
            return;
        }
        rootToLeafPathsSumToK(root.left, k - rootData, s);
        rootToLeafPathsSumToK(root.right, k - rootData, s);
    }

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        String s="";
        rootToLeafPathsSumToK(root,k,s);
	}

}
