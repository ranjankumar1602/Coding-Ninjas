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
    
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int startp,int endp,int starti,int endi) {
        if(startp>endp) {
            return null;
        }
        int rootdata= preOrder[startp];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        int rootIndexinOrder=-1;
        for(int i=starti;i<=endi;i++) {
            if(rootdata==inOrder[i]) {
                rootIndexinOrder=i;
                break;
            }
        }
        int startInLeft=starti;
    	int endInLeft=rootIndexinOrder-1;
        
        int startPreLeft=startp+1;
    	int leftSubTreeLength = endInLeft - startInLeft + 1;
    	int endPreLeft=(startPreLeft)+(leftSubTreeLength-1);
        
        int startInRight=rootIndexinOrder+1;
    	int endInRight=endi;
    	
    	int startPreRight=endPreLeft+1;
    	int endPreRight=endp;
        
        BinaryTreeNode<Integer> leftChild = buildTree(preOrder, inOrder, startPreLeft, endPreLeft, startInLeft, endInLeft);
    	BinaryTreeNode<Integer> rightChild = buildTree(preOrder, inOrder, startPreRight, endPreRight, startInRight, endInRight);
    	root.left=leftChild;
    	root.right=rightChild;
        
    	return root;
    }

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> root=buildTree(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
        return root;
	}

}
