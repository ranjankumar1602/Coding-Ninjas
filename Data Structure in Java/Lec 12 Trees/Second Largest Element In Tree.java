

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
    public static TreeNode<Integer> largest;
    public static TreeNode<Integer> secondLargest;
    
    public static void findSecondLargestHelper(TreeNode<Integer> root){
        if(root==null) {
            return;
        }
        if(root.data>largest.data) {
            secondLargest=largest;
            largest=root;
        }else if(root.data > secondLargest.data && root.data!=largest.data) {
            secondLargest=root;
        }
        
        for(TreeNode<Integer> i:root.children) {
            findSecondLargestHelper(i);
        }

	}
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        largest = new TreeNode<Integer>(Integer.MIN_VALUE);
        secondLargest = largest;
         
        findSecondLargestHelper(root);
        return secondLargest;
        

	}
	
	
}
