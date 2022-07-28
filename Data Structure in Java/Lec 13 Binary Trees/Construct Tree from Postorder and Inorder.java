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
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int poS,int poE,int inS,int inE) {
        if(poS>poE) {
            return null;
        }
        int rootdata=postOrder[poE];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        int rootindex=-1;
        for(int i=inS;i<=inE;i++) {
            if(rootdata==inOrder[i]) {
                rootindex=i;
                break;
            }
        }
        int leftinS = inS;
        int leftinE = rootindex - 1;
        int leftpoS = poS;
        int leftpoE = leftpoS + leftinE - leftinS;
        int rightinS = rootindex + 1;
        int rightinE = inE;
        int rightpoS = leftpoE + 1;
        int rightpoE = poE - 1 ;
        
        BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, leftpoS, leftpoE, leftinS, leftinE);
    	BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, rightpoS, rightpoE, rightinS, rightinE);
    	root.left=leftChild;
    	root.right=rightChild;
        
        return root;
    }

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}

}
