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
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int preS, int preE, int inS, int inE) {
		if(preS > preE) {
            return null;
        }
        int rootdata=preOrder[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        int rootindex=-1;
        for(int i=inS;i<=inE;i++) {
            if(inOrder[i]==rootdata) {
                rootindex=i;
                break;
            }
        }
        int leftinS = inS;
        int leftinE = rootindex - 1;
        int leftpreS = preS + 1;
        int leftpreE = leftpreS + leftinE - leftinS;
        
        int rightinS = rootindex + 1;
        int rightinE = inE;
        int rightpreS = leftpreE + 1;
        int rightpreE = preE;
        
        BinaryTreeNode<Integer> leftchild = buildTree(preOrder,inOrder,leftpreS,leftpreE,leftinS,leftinE);
        BinaryTreeNode<Integer> rightchild = buildTree(preOrder,inOrder,rightpreS,rightpreE,rightinS,rightinE);
        root.left=leftchild;
        root.right=rightchild;
        
        return root;
	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        return buildTree(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
	}

}
