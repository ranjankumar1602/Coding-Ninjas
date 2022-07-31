import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root==null) {
            return null;
        }
        if(root.data == data) {
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        
        if(root.data > data) {
            ArrayList<Integer> leftOutput = getPath(root.left, data);
            if(leftOutput!= null) {
                leftOutput.add(root.data);
                return leftOutput;
            }
        }
        if(root.data < data) {
            ArrayList<Integer> rightOutput = getPath(root.right, data);
            if(rightOutput!= null) {
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        return null;
	}
}
