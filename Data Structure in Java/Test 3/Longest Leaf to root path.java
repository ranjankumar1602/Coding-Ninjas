import java.util.ArrayList;

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root == null) {
        	ArrayList<Integer> output = new ArrayList<>();
        	return output;
    	}
        ArrayList<Integer> right = longestRootToLeafPath(root.right);
        ArrayList<Integer> left = longestRootToLeafPath(root.left);
        
        if(right.size() < left.size()) {
        	left.add(root.data);
    	} else {
        	right.add(root.data);
    	}
        
        return (left.size() > right.size() ? left :right);
	}

}
