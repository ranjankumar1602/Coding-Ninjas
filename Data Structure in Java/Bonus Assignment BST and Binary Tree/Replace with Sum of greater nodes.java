public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

    
    public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root ,int sum){
        if(root == null){
            return 0;
        }
        
        int right = replaceWithLargerNodesSum(root.right ,sum);
        int rootdata = root.data;
        root.data = root.data + right + sum;
        int left = replaceWithLargerNodesSum(root.left ,root.data);
        
        return rootdata + right + left;
        
    }
    
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root == null) {
            return;
        }
        int ans= replaceWithLargerNodesSum(root,0);

	}
}
